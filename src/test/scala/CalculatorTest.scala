
import org.scalatest.FlatSpec
class CalculatorTest extends FlatSpec {


    "Calc" should "add properly" in{
      assert(Calculator.add(2,2)==4)
    }
}


