object first {
  def main(args: Array[String]): Unit = {
    val p1: Point = new Point(10, 10)
    val p2: Point = new Point(100, 100)
    println(p1.distance(p2))
    // +などの中値演算子はメソッド呼び出しと同じ
    println(p1 + p2)
  }
}

class Point(val x: Int, val y: Int) { // フィールドの宣言とコンストラクタに渡される引数は一緒
  def distance(that: Point): Int = {
    val xdiff = math.abs(this.x - that.x)
    val ydiff = math.abs(this.y - that.y)
    math.sqrt(xdiff * xdiff + ydiff * ydiff).toInt
  }

  def +(that: Point): Point = new Point(x + that.x, y + that.y)
}