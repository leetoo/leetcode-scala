package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P7_TwoSum2_SortedArraySpec extends FlatSpec with Matchers {
  
  "P6_TwoSum" should "findTwoSum works" in {
    assert(P7_TwoSum2_SortedArray.findTwoSum(List(2, 7, 11, 15), 9) === Some((0,1)))
    assert(P7_TwoSum2_SortedArray.findTwoSum(List(1, 2, 5, 7, 11, 15), 9) === Some((1,3)))
    assert(P7_TwoSum2_SortedArray.findTwoSum(List(-2, 1, 5, 7, 11, 15), 9) === Some((0,4)))
    
    intercept[IllegalArgumentException] {
      P7_TwoSum2_SortedArray.findTwoSum(List(1, -2, 5, 7, 11, 15), 9)
    }
  }
  
}
