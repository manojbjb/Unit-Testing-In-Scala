package assertions

import com.h2.entities.Email
import org.scalatest.flatspec.AnyFlatSpec

class EmailSpec extends AnyFlatSpec{
  behavior of "An Email"
  it must "return an email object when a valid email string is passed" in {
    val email = Email("deymk@dbs.com")

    assert(email.localPart === "deymk")
    assert(email.domain === "dbs.com")
  }
  it should "return another email object for another valid string" in {
    assertResult("manoj.bjb")
    {
      Email("manoj.bjb@gmail.com").localPart
    }
  }

}
