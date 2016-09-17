package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P8_TwoSum3_ClassDesignSpec extends FlatSpec with Matchers {
  "P8_TwoSum3_ClassDesign" should "instance find two sum works" in {
    val instance = P8_TwoSum3_ClassDesign.TwoSum()
    assert(!instance.find(0))
    assert(instance.add(1).add(3).add(5).find(4))
    assert(!instance.add(1).add(3).add(5).find(7))
    assert(instance.add(1).add(3).add(5).add(2).find(7))
  }
}
