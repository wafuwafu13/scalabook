object second {
  // main�łȂ���΂Ȃ�Ȃ�
  def main(args: Array[String]): Unit = {
    println(Add(1, 2))
  }
}

// object = java��static �ΏۂƂȂ�I�u�W�F�N�g�����݂��Ȃ����A���炩�̎葱�����`������
object Add {
  def apply(x: Int, y: Int): Int = x + y
}
