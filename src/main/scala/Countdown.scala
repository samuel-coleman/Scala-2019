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
    val arrayOfNumbers =('a' to 'z').toArray.diff(Array('a','e','o','i','u'))
    arrayOfNumbers(letterID).toString
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
