package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P14_MergeSortedSpec extends FlatSpec with Matchers {
  "P14_MergeSorted" should "mergeSorted works" in {
    assert(P14_MergeSorted.mergeSorted(List(1,2,4,7), List(3,5,6)) === (1 to 7).toList)
  }
  
}
