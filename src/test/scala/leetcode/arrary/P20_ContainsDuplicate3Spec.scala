package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P20_ContainsDuplicate3Spec extends FlatSpec with Matchers {
  "P20_ContainsDuplicate3" should "findDuplicate works" in {
    assert(P20_ContainsDuplicate3.findDuplicate(List(1,2,3,4,5,6,7), 0, 10) === false)
    assert(P20_ContainsDuplicate3.findDuplicate(List(1,2,3,4,5,6,7), 1, 10) === true)
    assert(P20_ContainsDuplicate3.findDuplicate(List(1,2,3,4,5,6,7), 1, 1) === true)
    
    assert(P20_ContainsDuplicate3.findDuplicate(List(10,20,30,40,50,60,70,100), 9, 2) === false)
    assert(P20_ContainsDuplicate3.findDuplicate(List(20,40,60,80,100), 10, 2) === false)
    assert(P20_ContainsDuplicate3.findDuplicate(List(20,40,60,80,100), 20, 2) === true)
    assert(P20_ContainsDuplicate3.findDuplicate(List(20,40,60,40,80,100), 10, 1) === false)
    assert(P20_ContainsDuplicate3.findDuplicate(List(20,40,60,40,80,100), 10, 2) === true)
  }
}
