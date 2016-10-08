package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P28_MinimumInSortedArrSpec  extends FlatSpec with Matchers {
  "findMinimum" should "works" in {
    assert(P28_MinimumInSortedArr.findMinimum(List(1,2,3, 0)) === 0)
    assert(P28_MinimumInSortedArr.findMinimum(List(3,1,2)) === 1)
    assert(P28_MinimumInSortedArr.findMinimum(List(3)) === 3)
  }
}
