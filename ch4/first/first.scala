// java.lang, scala, scala.Predef����̓C���|�[�g�����Ɏg����

object first {
  def main(args: Array[String]): Unit = {
    val mutableSeq = scala.collection.mutable.Seq(1, 2, 3)
    mutableSeq(0) = 10
  }
}
