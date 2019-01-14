object Hangman extends App {

 import scala.io.Source

  def randomWord(numLetters:Int): String={
    val wordList  = Source.fromFile("C:\\Users\\Admin\\Documents\\Coleman Scala\\nWords.txt").getLines.toList.filter(_.length==numLetters)
    val word = wordList(scala.util.Random.nextInt(wordList.length))
    for (0 <- word.length){
      print(" _ ")
    }
  }

  var letterPos = ""

  def letterCheck(letter:Char, word:String): Unit ={
    letterPos=""
    for(i <- 0 until word.length){
      if(letter==word(i))letterPos += i.toString
    }
  }

  def game(word:String): Unit ={
    println("HANGMAN \n Select the number of letters you want to play")
    val numChoice = scala.io.StdIn.readInt()
    println("Word has been chosen:")
    val word=randomWord(numChoice)
    var lives=5
    while(lives>0){
      println("Select your letter")
      val choice = scala.io.StdIn.readChar()
      letterCheck(choice,word)
      letterPos.toArray

      lives-=1
    }
  }

}

