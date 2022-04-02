import scala.concurrent.Future
import scala.io.BufferedSource
import scala.io.Source
import scala.util._
import scala.concurrent._
// 内部にスレッドプールを保持している Futureはそれを使って並行処理を行う
// if not: Cannot find an implicit ExecutionContext.
import ExecutionContext.Implicits.global

object first {
  def main(args: Array[String]): Unit = {
    val failedFuture = Future(HttpTextClient.get("http://scalamaturi.org/"))
    failedFuture.onComplete {
      case Success(body) =>
        println(body.mkString)
        body.close()
      case Failure(throwable) => println(throwable.toString)
      case _ => println("hoge")
    }
  }
}

object HttpTextClient {
  def get(url: String): BufferedSource = Source.fromURL(url)
}
