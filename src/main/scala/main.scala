object main extends App{

  def String1(x:String, y:Int):String={
    x.substring(x.length-y)
  }

  //println(String1("Human",5))


  def String2(a:String, b:String, x:Char, y:Char):String={
    var word = a+b
    var word2 = ""
    var i =0
    while(i < word.length){
      if(word.substring(i,i+1)==x.toString){
        word2=word2+y
      }
      else{
        word2+=word.substring(i,i+1)
      }
      i+=1
    }
    word2
  }

  //println(String2("Hal","loahaha",'a','e'))


  def Operators(x:Int, y:Int):Int={
    x+y
  }

  //println(Operators(2,5))

  def Conditionals(x:Int, y:Int, bool:Boolean):Int={
    var result=0
    if(bool==true){
      result = x+y
    }
    else{
      result = x*y
    }
    result
  }

  //println(Conditionals(2,5,false))


  def Conditionals2(x:Int, y:Int, bool:Boolean):Int={
    var result=0
    if(bool==true){
      result = x+y
    }
    if(bool==false){
      result = x*y
    }
    if(x==0){
      result=y
    }
    if(y==0){
      result=x
    }
    result
  }

  //println(Conditionals2(2,5,false))


  def iteration(word:String, num:Int){
    for(i <-1 to num){
      println(word)
    }
  }

  //iteration("Hi",5)


  def iteration2(word:String, num:Int){
    val lenWord = word.length
    var line =""
    lenWord match{
      case 1 => line=word*num
      case _ => line=word
    }
    for(i <- 1 to num){
      println(line)
    }
  }

  //iteration2("H",2)


  def iteration2square(word:String, num:Int){
    val line =word*num
    for(i <- 1 to num){
      println(line)
    }
  }

  //iteration2square("Hello",5)


  def iteration3(f:String, b:String, num:Int):String={
    var output=""
    for(i<-1 to num){
      if(i%3 == 0){
        output += f+","
      }
      if(i%5 ==0){
        output += b+","
      }
      if(i%3 == 0 && i%5 ==0){
        output+= f+b+","
      }
      if(i%3 != 0 && i%5 != 0){
        output+= i+","
      }
    }
    output
  }

  //println(iteration3("Fizz","Buzz",15))


  def recursion1(word:String, num:Int){
    if(num>0){
      println(word)
      recursion1(word, num-1)
    }
  }
  //recursion1("Hi",4)


  def recursion2(word:String, num:Int){
    val line =word*4
    if(num>0){
      println(line)
      recursion2(word,num-1)
    }
  }
  //recursion2("H",7)


   //I haven't quite got this exercise to work properly yet. In its current state it outputs ",Buzz".
  var output=""
  def recursion3(f:String, b:String, num:Int):String={
    if (num > 1) {
      if (num % 3 == 0) {
        output = f + output
      }
      if (num % 5 == 0) {
        output = b + output
      }
      if (num % 3 == 0 && num % 5 == 0) {
        output = f + b + output
      }
      if (num % 3 != 0 && num % 5 != 0) {
        output = ""+num
      }
    }
    if(num==1){
      output=1+output
    }
    else{println(output);sys.exit}

    recursion3(f, b, num - 1)
  }
  //recursion3("Fizz","Buzz",10)



  def patternMatching1A(x:Int, y:Int, bool:Boolean):Int={
    var result=0
    bool match{
      case true => result = x+y
      case false => result = x*y
    }
    result
  }

  //println(patternMatching1A(2,5,true))


  def patternMatching1B(x:Int, y:Int, bool:Boolean):Int={
    var result=0
    bool match{
      case true => result = x+y
      case false => result = x*y
    }
    if(x==0){
      result=y
    }
    if(y==0){
      result=x
    }
    result
  }

  //println(patternMatching1B(2,5,false))
  def bottlesObeer1(x:Int){
    if(x>1) {
      println(x + " bottles of beer on the wall, " + x + " bottles of beer, you take one down, pass it around, " + (x - 1) + " bottles of beer on the wall.")
      bottlesObeer1(x - 1)
    }
    if(x==1){
      println(x+" bottle of beer on the wall, "+x+" bottle of beer, you take it down, pass it around, no more bottles of beer on the wall.")
      bottlesObeer1(x-1)
     }
    if(x==0){
      println("No more bottles of beer on the wall, no more bottles of beer, Go to the store, buy some more, 99 bottles of beer on the wall.")
      sys.exit
    }

  }
  //bottlesObeer1(99)


  def bottlesObeer2(x:Int){
    val bot = "bottles of beer"
    var y = x-1
    if(x>0){
      println(s"$x $bot on the wall, $x $bot, you take one down, pass it around, $y $bot on the wall.")
      bottlesObeer2(x-1)
    }
    if(x==1){
      println(s"$x 4bot on the wall, $x $bot, you take it down, pass it around, no more $bot on the wall.")
      bottlesObeer2(x-1)
    }
    if(x==0){
      println(s"No more $bot on the wall, No more $bot, Go to the store, buy some more, 99 $bot on the wall.")
    }
  }
  //bottlesObeer2(99)



  def patternMatching2(x:Int, y:Int){
    var num1 = x
    var num2 = y
    println(num2+","+num1)
  def second(){
    val myArray = Array.fill(1000000)(0)
    for(i <- 0 until 1000000) {
      myArray(i) = i + 1
    }
    myArray(9999)=100000
   var inc = 0
    while( inc < myArray.length){
      if(myArray(inc) != (inc+1)){
        println(myArray(inc)+" is repeated.")
        sys.exit
      }
      inc+=1
    }
  }
  //patternMatching2(1,2)

  //second()

  //Unfinished Functional 1
  /*def Functional1() {
    val timeZones = java.util.TimeZone.getAvailableIDs
    var i=1
    while(i < timeZones.length){
     timeZones(i)=timeZones(i).split("/")

      i+=1
    }
    println(timeZones.deep.mkString("\n"))

  }
  //Functional1()
  */

  //Wednesday Start

  //Intermediate

  def blackjack(play1:Int, play2:Int):Int ={
    var winner = 0
    if(play1>play2 || (play2>21 && play1<=21)){
      winner = play1
    }
    if(play2>play1 || (play1>21 && play2<=21)){
      winner = play2
    }
    winner
  }
  //println(blackjack(22,18))

  def uniqueSum(x:Int, y:Int, z:Int):Int={
    var number=0
    number
  }

  // Email Exercises

  //Broken Keyboard

  def randomLetters(): String ={
    val word = scala.util.Random.alphanumeric.filter(_.isLetter).take(4).mkString.toLowerCase
    word
  }

  def findingWord(letters:String):String={
    import scala.io.Source
    val nWords = Source.fromFile("C:\\Users\\Admin\\Documents\\Coleman Scala\\nWords.txt").getLines.toList.filter(x => x.contains(letters(0)) || x.contains(letters(1)) || x.contains(letters(2)) || x.contains(letters(3)) )
    var correct:String = ""
    for(i <- 0 to (nWords.length-1)){
      if(isLetter(letters,nWords(i))==true){
        correct = correct + nWords(i)
      }
    }
    var correctList = correct.split(" ")
    var longest:String = correctList(0)
    for(i<- 0 to (correct.length-1)){
      if(longest.length < correctList(i).length ){
        longest = correctList(i)
      }

    }
    longest
  }

  def isLetter(letters:String, word:String): Boolean = {
    var result = false
    for(i <- 0 to (word.length-1)) {
      if (word(i) == letters(0) || word(i) == letters(1) || word(i) == letters(2) || word(i) == letters(3)) {
        result = true
      }
      else {
        result = false
      }
    }
    result
  }


  def brokenKeyboard(inNum:Int){
    for(i <- 1 to inNum){
      println(s"")
    }
  }

}