package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P30_FindPeakElemSpec extends FlatSpec with Matchers {
  "indexPeaks" should "works" in {
    assert(P30_FindPeakElem.indexPeaks(List(1,2,3,1)) === List(3))
    assert(P30_FindPeakElem.indexPeaks(List(1,2,3,1,3,2)) === List(3,3))
    assert(P30_FindPeakElem.indexPeaks(List(1,2,2,1)) === Nil)
    assert(P30_FindPeakElem.indexPeaks(List(1,2,2,1,Int.MaxValue)) === Nil)
    assert(P30_FindPeakElem.indexPeaks(List(1,2,2,1,Int.MaxValue,2)) === List(Int.MaxValue))
  }
}
