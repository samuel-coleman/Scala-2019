object Morse extends App {

  def alphabet(letter:Char): String ={
    letter match{
      case 'a' | 'A' => ".-"
      case 'b' | 'B' => "-..."
      case 'c' | 'C' => "-.-."
      case 'd' | 'D' => "-.."
      case 'e' | 'E' => "."
      case 'f' | 'F' => "..-."
      case 'g' | 'G' => "--."
      case 'h' | 'H' => "...."
      case 'i' | 'I' => ".."
      case 'j' | 'J' => ".---"
      case 'k' | 'K' => "-.-"
      case 'l' | 'L' => ".-.."
      case 'm' | 'M' => "--"
      case 'n' | 'N' => "-."
      case 'o' | 'O' => "---"
      case 'p' | 'P' => ".--."
      case 'q' | 'Q' => "--.-"
      case 'r' | 'R' => ".-."
      case 's' | 'S' => "..."
      case 't' | 'T' => "-"
      case 'u' | 'U' => "..-"
      case 'v' | 'V' => "...-"
      case 'w' | 'W' => ".--"
      case 'x' | 'X' => "-..-"
      case 'y' | 'Y' => "-.--"
      case 'z' | 'Z' => "--.."
      case '1' => ".----"
      case '2' => "..---"
      case '3' => "...--"
      case '4' => "....-"
      case '5' => "....."
      case '6' => "-...."
      case '7' => "--..."
      case '8' => "---.."
      case '9' => "----."
      case '0' => "-----"
      case ' ' => " / "
    }
  }

  def translator(word:String):String={
    var result=""
    for(i <- 0 until word.length){
      result += alphabet(word(i))
    }
    result
  }
  println("Type what you want to encode:")
  println(translator(scala.io.StdIn.readLine()))
}
