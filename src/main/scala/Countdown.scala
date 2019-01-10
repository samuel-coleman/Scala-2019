object Countdown {

  def vowel(): String = {
    val r = scala.util.Random
    val letterID = r.nextInt(4)
    letterID match {
      case 0 => "A"
      case 1 => "E"
      case 2 => "I"
      case 3 => "O"
      case 4 => "U"
    }
  }

  def consonant():String= {
    val r = scala.util.Random
    val letterID = r.nextInt(20)
    letterID match {
      case 0 => "B"
      case 1 => "C"
      case 2 => "D"
      case 3 => "F"
      case 4 => "G"
      case 5 => "H"
      case 6 => "J"
      case 7 => "K"
      case 8 => "L"
      case 9 => "M"
      case 10 => "N"
      case 11 => "P"
      case 12 => "Q"
      case 13 => "R"
      case 14 => "S"
      case 15 => "T"
      case 16 => "V"
      case 17 => "W"
      case 18 => "X"
      case 19 => "Y"
      case 20 => "Z"
    }
  }

    def selection():String={
        println("Vowel or Consonant? (v/c)")
        val choice = scala.io.StdIn.readLine()
        choice match{
          case "v" | "V" => vowel()
          case "c" | "C" => consonant()
        }
    }

  println(12)










}
