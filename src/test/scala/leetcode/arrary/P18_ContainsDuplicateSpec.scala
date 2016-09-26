package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P18_ContainsDuplicateSpec extends FlatSpec with Matchers {
  "P18_ContainsDuplicate" should "findDuplicates works" in {
    assert(P18_ContainsDuplicate.findDuplicates(List(1,2,3,4,3,4)) === List(4,3))
    assert(P18_ContainsDuplicate.findDuplicates(List(1,2,3,4)) === Nil)
  }
}
