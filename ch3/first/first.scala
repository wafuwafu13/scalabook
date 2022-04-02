import java.io.File

object first {
  def main(args: Array[String]): Unit = {
    val directory = new File("not")
    val maybeFiles = myListFiles(directory)
    maybeFiles.foreach(println)
  }

  def myListFiles(directory: File): Option[Array[File]] = Option(directory.listFiles())
}
