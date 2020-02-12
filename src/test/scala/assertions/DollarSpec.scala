package assertions

import com.h2.entities.Dollars
import org.scalatest.flatspec.AnyFlatSpec

class DollarSpec extends AnyFlatSpec {
behavior of "A Dollar"
  it should "create a correct dollar object for number 10 as input" in {
    val tenDollars = Dollars(10)
    assert("$10"===tenDollars.toString)
  }
  it should "correctly identifies that $10 > $5" in {
    val tenDollars = Dollars(10)
    val fiveDollars = Dollars(5)
    assert(tenDollars > fiveDollars)
  }
  it should "correctly identifies that $2 < $5" in {
    val twoDollars = Dollars(2)
    val fiveDollars = Dollars(5)
    assert(twoDollars < fiveDollars)
  }
  it should "add correctly two dollar amounts" in {
    val twoDollars = Dollars(2)
    val fiveDollars = Dollars(5)

    assertResult("$7"){
      (twoDollars+fiveDollars).toString
    }
  }
  it should "subtract correctly two dollar amounts" in {
    val twoDollars = Dollars(2)
    val fiveDollars = Dollars(5)

    assertResult("$3"){
      (fiveDollars-twoDollars).toString
    }
  }
  it should "correctly identifies that $4=$4" in{
    val fourDollars=Dollars(4)
    assertResult(true){
      fourDollars == fourDollars
    }
  }


}
