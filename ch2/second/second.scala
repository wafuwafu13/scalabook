object second {
  // mainでなければならない
  def main(args: Array[String]): Unit = {
    println(Add(1, 2))
  }
}

// object = javaのstatic 対象となるオブジェクトが存在しないが、何らかの手続きを定義したい
object Add {
  def apply(x: Int, y: Int): Int = x + y
}
