object Countdown extends App {
  import scala.io.Source

  def vowel(): String = {
    val letterID = scala.util.Random.nextInt(4)
    letterID match {
      case 0 => "a"
      case 1 => "e"
      case 2 => "i"
      case 3 => "o"
      case 4 => "u"
    }
  }

  def consonant():String= {
    val letterID = scala.util.Random.nextInt(20)
    letterID match {
      case 0 => "b"
      case 1 => "c"
      case 2 => "d"
      case 3 => "f"
      case 4 => "g"
      case 5 => "h"
      case 6 => "j"
      case 7 => "k"
      case 8 => "l"
      case 9 => "m"
      case 10 => "n"
      case 11 => "p"
      case 12 => "q"
      case 13 => "r"
      case 14 => "s"
      case 15 => "t"
      case 16 => "v"
      case 17 => "w"
      case 18 => "x"
      case 19 => "y"
      case 20 => "z"
    }
  }

  def selection():Array[Char]={
    var word=""
    var i=0
    while(i < 9) {
     println("Vowel or Consonant? (v/c)")
     val choice = scala.io.StdIn.readLine()
     choice match {
       case "v" | "V" => word+=vowel(); i+=1
       case "c" | "C" => word+=consonant(); i+=1
       case _ => println("Please use the correct selection key")
     }
      println(word)
    }
    println(word.toArray.mkString(""))
    word.toArray.distinct
  }

  def longest(letters:Array[Char]): Unit ={

   val wordList = Source.fromFile("C:\\Users\\Admin\\Documents\\Coleman Scala\\nWords.txt").getLines.toList

    ('a' to 'z').toArray
      .diff(letters)
      .foreach(
        key => wordList.filter(!_.contains(key))
      )

   println(wordList.sortBy(_.length).last)
  }

  longest(selection())




}
