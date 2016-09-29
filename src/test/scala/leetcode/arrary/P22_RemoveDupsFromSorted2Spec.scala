package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P22_RemoveDupsFromSorted2Spec extends FlatSpec with Matchers {
  
  "P22_RemoveDupsFromSorted2" should "unique works" in {
    assert(P22_RemoveDupsFromSorted2.unique2(List(1,2,2)) === List(1,2,2))
    assert(P22_RemoveDupsFromSorted2.unique2(List(1,2,2,2)) === List(1,2,2))
    assert(P22_RemoveDupsFromSorted2.unique2(List(1,2,2,2,3)) === List(1,2,2,3))
    assert(P22_RemoveDupsFromSorted2.unique2(List(1,2,3)) === List(1,2,3))
    assert(P22_RemoveDupsFromSorted2.unique2(List(2,2,2)) === List(2,2))
    assert(P22_RemoveDupsFromSorted2.unique2(Nil) === Nil)
  }
}
