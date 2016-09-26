package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P19_ContainsDuplicate2Spec extends FlatSpec with Matchers {
  "P19_ContainsDuplicate2" should "findDuplicate works" in {
    assert(P19_ContainsDuplicate2.findDuplicate(List(1,2,3,4,5,6,7), 10) === false)
    assert(P19_ContainsDuplicate2.findDuplicate(List(1,2,3,4,5,6,7,1), 10) === true)
    assert(P19_ContainsDuplicate2.findDuplicate(List(1,2,3,4,5,6,7,5), 3) === true)
    assert(P19_ContainsDuplicate2.findDuplicate(List(1,2,3,4,5,6,7,1), 2) === false)
  }
  
  it should "findDuplicateV2 works" in {
    assert(P19_ContainsDuplicate2.findDuplicateV2(List(1,2,3,4,5,6,7), 10) === false)
    assert(P19_ContainsDuplicate2.findDuplicateV2(List(1,2,3,1,5,6,7), 10) === true)
    assert(P19_ContainsDuplicate2.findDuplicateV2(List(1,2,3,4,5,6,7,5), 3) === true)
    assert(P19_ContainsDuplicate2.findDuplicateV2(List(1,2,3,4,5,6,7,1), 2) === false)
  }
  
  
}
