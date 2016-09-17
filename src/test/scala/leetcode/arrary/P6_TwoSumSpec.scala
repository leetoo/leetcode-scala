package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P6_TwoSumSpec extends FlatSpec with Matchers {
  "P6_TwoSum" should "findTwoSum works" in {
    assert(P6_TwoSum.findTwoSum(List(2, 7, 11, 15), 9) === Some((0,1)))
    assert(P6_TwoSum.findTwoSum(List(1, 2, 5, 7, 11, 15), 9) === Some((1,3)))
    assert(P6_TwoSum.findTwoSum(List(1, -2, 5, 7, 11, 15), 9) === Some((1,4)))
  }
}
