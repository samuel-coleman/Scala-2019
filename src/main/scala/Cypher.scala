object Cypher extends App{

  def cypher(input:String):String={
    val alphabet = ('a' to 'z').toArray
    var output=""
    for(i <- 0 until input.length)output += alphabet(25-alphabet.indexOf(input(i))).toString
    output
  }
  println("Type the word you want to code")
  println(cypher(scala.io.StdIn.readLine()))
}
