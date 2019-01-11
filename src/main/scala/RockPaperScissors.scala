object RockPaperScissors extends App {

  def draw(play1:String, play2:String):String={
    val drawResult:String=play1+play2
    var display = ""
    drawResult match{
      case "RR" | "PP" | "SS" => display="Draw"
      case "RS" | "PR" | "SP" => display="Player Wins!" ; playerScore+=1
      case "RP" | "PS" | "SR" => display="AI Wins!" ; aiScore+=1
    }
    display
  }

  def player(): String ={

    var i=0
    var choiceLetter = ""
    var choiceWord =""
    while(i==0) {
      println("Rock, Paper, or Scissors? (R,P,S?)")
      val choice=scala.io.StdIn.readLine()
      choice match {
        case "r" | "R" => choiceLetter="R" ; i=1 ; choiceWord = "Rock"
        case "p" | "P" => choiceLetter="P" ; i=1 ; choiceWord = "Paper"
        case "s" | "S" => choiceLetter="S" ; i=1 ; choiceWord = "Scissors"
        case _ => println("Select a valid choice")
      }
    }
    println("Player chose: "+choiceWord)
    playerChoice=choiceLetter
    choiceLetter
  }

  def aiRandom ():String={
    val aiRandom = scala.util.Random.nextInt(2)
    var choiceWord=""
    var choiceLetter = ""
    aiRandom match{
      case 0 => choiceLetter="R" ; choiceWord="Rock"
      case 1 => choiceLetter="P" ; choiceWord="Paper"
      case 2 => choiceLetter="S" ; choiceWord="Scissors"
    }
    choiceLetter
  }

  var movesHistory = ""
  var playerChoice = ""
  var gameCount=0

  def aiTactical (playerMove:String): String={

    val timesRock =movesHistory.count(_=='R')
    val timesPaper = movesHistory.count(_=='P')
    val timesScissors = movesHistory.count(_=='S')
    var tacticMove =""
    if(timesRock>timesPaper && timesRock>timesScissors)tacticMove="P"
    if(timesPaper>timesRock && timesPaper>timesScissors)tacticMove="S"
    if(timesScissors>timesRock && timesScissors > timesPaper)tacticMove="R"
    if((timesRock==timesPaper && timesRock==timesScissors) || (timesRock==timesPaper && timesRock>timesScissors) || (timesPaper==timesScissors && timesPaper>timesRock) ||
      (timesRock==timesScissors && timesScissors>timesPaper)){tacticMove=aiRandom()}
    while(gameCount==0){tacticMove=aiRandom();gameCount=1}
    var choiceWord=""
    tacticMove match{
      case "R" => choiceWord="Rock"
      case "P" => choiceWord="Paper"
      case "S" => choiceWord="Scissors"
    }
    movesHistory += playerMove
    println("AI chose: "+choiceWord)
    tacticMove
  }

  def menu(): Unit ={
    var play = 1
    while(play != 0){
      println("Do you want to play a game? (y/n)")
      val game = scala.io.StdIn.readLine()
      game match{
        case "y" | "Y" => play=1 ; println(draw(player(), aiTactical(playerChoice))) ; println("Score: "+ score(playerScore,aiScore))
        case "n" | "N" => println("Final Score: "+score(playerScore,aiScore));play=0
        case _ => println("Wrong input, select y/n")
      }
    }
  }

  var aiScore = 0
  var playerScore = 0

  def score(player:Int, ai:Int): String ={
    s"Player $player - $ai AI"
  }
  menu()


}