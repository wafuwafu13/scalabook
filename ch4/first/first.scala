// java.lang, scala, scala.Predefからはインポートせずに使える

object first {
  def main(args: Array[String]): Unit = {
    val mutableSeq = scala.collection.mutable.Seq(1, 2, 3)
    mutableSeq(0) = 10
  }
}
