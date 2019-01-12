
import org.scalatest.FlatSpec
class CalculatorTest extends FlatSpec {

  "Calc" should "add properly" in{
    assert(Calculator.add(2,2)==4)
  }

  "Calc" should "subtract properly" in{
    assert(Calculator.subtract(2,2)==0)
  }

  "Calc" should "multiply properly" in{
    assert(Calculator.multiply(2,2)==4)
  }

  "Calc" should "divide properly" in{
    assert(Calculator.divide(4,2)==2)
  }
}


