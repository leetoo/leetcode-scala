package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P24_LongestSubstrWithKChars_GoogleSpec extends FlatSpec with Matchers {
  "P24_LongestSubstrWithKChars_Google" should " works" in {
    assert(P24_LongestSubstrWithKChars_Google.lgestStr("abcbbbbcccbdddadacb") === "bcbbbbcccb")
    assert(P24_LongestSubstrWithKChars_Google.lgestStr("abcbcdefgh") === "bcbc")
    assert(P24_LongestSubstrWithKChars_Google.lgestStr("basadddddddd") === "adddddddd")
    assert(P24_LongestSubstrWithKChars_Google.lgestStr("aaaaaaaaaaaab") === "aaaaaaaaaaaab")
    intercept[IllegalArgumentException] {
      P24_LongestSubstrWithKChars_Google.lgestStr("aa")
    }
    
  }
}
