object main extends App{

  /*def String1(x:String, y:Int):String={
    var word=x
    var amount=y
    var letters = word.substring(word.length-amount)
    return(letters)
  }

  println(String1("Human",5))
  */
  /*
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
    return(word2)
  }

  println(String2("Hal","loahaha",'a','e'))
  */
  /*
  def Operators(x:Int, y:Int):Int={
    var sum = x+y
    return(sum)
  }

  println(Operators(2,5))
  */
  /*
  def Conditionals(x:Int, y:Int, bool:Boolean):Int={
    var result=0
    if(bool==true){
      result = x+y
    }
    else{
      result = x*y
    }
    return(result)
  }

  println(Conditionals(2,5,false))
  */
  /*
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
    return(result)
  }

  println(Conditionals2(2,5,false))
  */
  /*
  def iteration(word:String, num:Int){
    for(i <-1 to num){
      println(word)
      i+=1
    }
  }

  iteration("Hi",5)
  */
  /*
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

  iteration2("H",2)
  */
  /*
  def iteration2square(word:String, num:Int){
    val line =word*num
    for(i <- 1 to num){
      println(line)
    }
  }

  iteration2square("Hello",5)
  */
  /*
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
    return(output)
  }

  println(iteration3("Fizz","Buzz",15))
  */
  /*
  def patternMatching1A(x:Int, y:Int, bool:Boolean):Int={
    var result=0
    bool match{
      case true => result = x+y
      case false => result = x*y
    }
    return(result)
  }

  println(patternMatching1A(2,5,true))
  */

}