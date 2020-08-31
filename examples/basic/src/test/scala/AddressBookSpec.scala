import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import tutorial.addressbook.{AnotherSimpleType, SimpleType}

import scala.util.Failure

class AddressBookSpec extends AnyFreeSpec with Matchers {
  
  "ScalaPB generated companion objects" - {
    "Parsing bytes from another type should fail" in {
      val tried = SimpleType.validate(AnotherSimpleType(122, "brown").toByteArray)
      tried shouldBe a[Failure[_]]
    }  
  }
  
}
