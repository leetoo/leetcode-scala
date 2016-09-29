package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P23_LongestSubstrNoRepeatingSpec extends FlatSpec with Matchers {
  "P23_LongestSubstrNoRepeatingSpec" should "lgestSubstr works" in {
    assert(P23_LongestSubstrNoRepeating.lgestSubstr("abcbc") === 3)
    assert(P23_LongestSubstrNoRepeating.lgestSubstr("bcbc") === 2)
    assert(P23_LongestSubstrNoRepeating.lgestSubstr("bcbcde") === 4)
    assert(P23_LongestSubstrNoRepeating.lgestSubstr("aaa") === 1)
  }
  
}
