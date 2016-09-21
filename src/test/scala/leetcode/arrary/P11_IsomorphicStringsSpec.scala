package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P11_IsomorphicStringsSpec extends FlatSpec with Matchers {
  "P11_IsomorphicStringsSpec" should "ifIso works" in {
    assert(P11_IsomorphicStrings.ifIso("egg", "add") === true)
    assert(P11_IsomorphicStrings.ifIso("app", "add") === true)
    assert(P11_IsomorphicStrings.ifIso("app", "abc") === false)
  }
}
