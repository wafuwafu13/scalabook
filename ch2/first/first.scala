object first {
  def main(args: Array[String]): Unit = {
    val p1: Point = new Point(10, 10)
    val p2: Point = new Point(100, 100)
    println(p1.distance(p2))
    // +�Ȃǂ̒��l���Z�q�̓��\�b�h�Ăяo���Ɠ���
    println(p1 + p2)
  }
}

class Point(val x: Int, val y: Int) { // �t�B�[���h�̐錾�ƃR���X�g���N�^�ɓn���������͈ꏏ
  def distance(that: Point): Int = {
    val xdiff = math.abs(this.x - that.x)
    val ydiff = math.abs(this.y - that.y)
    math.sqrt(xdiff * xdiff + ydiff * ydiff).toInt
  }

  def +(that: Point): Point = new Point(x + that.x, y + that.y)
}