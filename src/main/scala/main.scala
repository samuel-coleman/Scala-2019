object main extends App{

  def String1(x:String, y:Int):String={
    x.substring(x.length-y)
  }

  //println(String1("Human",5))


  def String2(a:String, b:String, x:Char, y:Char):String={
    var word = (a+b)
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
      case 1 => line=(word*num)
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


  /* //I haven't quite got this exercise to work properly yet. In its current state it outputs ",Buzz".
  var output=""
  def recursion3(f:String, b:String, num:Int):String={
    if (num > 1) {
      if (num % 3 == 0) {
        output = "," + f + output
      }
      if (num % 5 == 0) {
        output = "," + b + output
      }
      if (num % 3 == 0 && num % 5 == 0) {
        output = "," + f + b + output
      }
      if (num % 3 != 0 && num % 5 != 0) {
        output = "," + num
      }
    }
    if(num==1){
      output=1+","+output
    }
    else{println(output);sys.exit}

    recursion3(f, b, num - 1)
  }
  recursion3("Fizz","Buzz",10)
  */


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

  def patternMatching2(x:Int, y:Int){
    var num1 = x
    var num2 = y
    println(num2+","+num1)
  }
  //patternMatching2(1,2)



}