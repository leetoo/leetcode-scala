package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P3_LongestPalindromicSubstringSpec extends FlatSpec with Matchers {
  
  "LongestPalindromicSubstring" should "findPS works" in {
    assert(P3_LongestPalindromicSubstring.findPS("dabcba") === "abcba")
    assert(P3_LongestPalindromicSubstring.findPS("dabcbasaoza") === "abcba")
    assert(P3_LongestPalindromicSubstring.findPS("aspaspaspba+abpsapsapsa") === "aspaspaspba+abpsapsapsa")
  }
}
