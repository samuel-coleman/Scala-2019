object Recursion extends App {

  var result1 = 0
  def rec1(recurNum:Int, n:Int):Int={
    if(n > 0){
      result1+=recurNum
      rec1(recurNum+1,n-1)
    }
    result1
  }
  //println(rec1(0,100))

  var result2 =1
  def factorial(n:Int):Int={
    if(n > 1){
      result2 *=n*factorial(n-1)
    }
    result2
  }
  //println(factorial(0))


}
