package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P16_MinimumSizeSubArrSumSpec extends FlatSpec with Matchers {
  "P16_MinimumSizeSubArrSum" should "findSubArr works" in {
    assert(P16_MinimumSizeSubArrSum.findSubArr(List(2,3,1,2,4,3), 7) === 2)
    assert(P16_MinimumSizeSubArrSum.findSubArr(List(2,3,1,2,4,3), 8) === 3)
    assert(P16_MinimumSizeSubArrSum.findSubArr(List(2,3,1,2,4,3), 4) === 1)
    assert(P16_MinimumSizeSubArrSum.findSubArr(List(2,3,1,2,4,3), 100) === 0)
  }
  
}
