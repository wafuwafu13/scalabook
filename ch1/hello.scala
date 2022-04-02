object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello World")
    // val name: Int = "Scala"

    val isAlphamericF = new Function1[String, Boolean] {
      def apply(str: String) = str.matches("[a-zA-Z0-9\\s]+")
    }
    val words = Seq("Scala", "2.12")
    val alphamericWords = words.filter(isAlphamericF)
    println(alphamericWords)
  }
}
