object Factorial extends App{

  def factorial(input:Int, recNum:Int): Unit ={
    var result2 =1
    def factorialEq(n:Int):Int={
      if(n > 1){
        result2 *=n*factorialEq(n-1)
      }
      result2
    }
    val facResult=factorialEq(recNum)
    if(input>facResult){factorial(input,recNum+1)}
    if(input<facResult)println(s"$input is NOT a factorial result")
    if(input==facResult)println(s"$input = $recNum!")
  }

  factorial(150,0)

}
