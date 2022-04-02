object fourth {
  def main(args: Array[String]): Unit = {
    println(sum(List(1, 2, 3))(IntAdder))
    //println(sum(List(1, 2, 3)))
  }
  // sum���Ăяo���Ƃ��ɁAimplicit�ƃ}�[�N���ꂽAdder[T]�̒l�����݂���΁A������Öق̓��ɕ⊮
  def sum[T](list: List[T])(implicit adder: Adder[T]): T = {
    // JS�ł�reduce �����l adder.zero
    list.foldLeft(adder.zero){(x, y) => adder.plus(x, y)}
  }

  implicit object IntAdder extends Adder[Int] {
    def zero: Int = 0
    def plus(x: Int, y: Int): Int = x + y
  }
}

trait Adder[T] {
  def zero: T
  def plus(x: T, y: T): T
}