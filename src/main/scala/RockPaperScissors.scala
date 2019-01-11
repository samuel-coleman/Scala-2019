object RockPaperScissors extends App {

  def draw(play1:Int, play2:Int):String={
    val drawResult:String=play1.toString+play2.toString
    drawResult match{
      case "11" | "22" | "33" => "Draw"
      case "13" | "21" | "32" => "Player 1 Wins"
      case "12" | "23" | "31" => "Player 2 Wins"
    }
  }

  def player(): Int ={
    println("Rock, Paper, or Scissors? (R,P,S?)")
    val choice=scala.io.StdIn.readLine()
    var i=0
    var choiceNum = 0
    while(i==0) {
      choice match {
        case "r" | "R" => choiceNum=1 ; i=1
        case "p" | "P" => choiceNum=2 ;i=1
        case "s" | "S" => choiceNum=3 ;i=1
        case _ => println("Select a valid choice")
      }
    }
    choiceNum
  }
}
