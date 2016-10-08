package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P26_MinimumWindowSubstringSpec extends FlatSpec with Matchers {
  "findMW" should "works" in {
    assert(P26_MinimumWindowSubstring.findMW("ADOBECODEBANC", "ABC") === "BANC")
    assert(P26_MinimumWindowSubstring.findMW("ADOBEC", "ABC") === "ADOBEC")
    assert(P26_MinimumWindowSubstring.findMW("ADOBEC", "ABCDE") === "ADOBEC")
    assert(P26_MinimumWindowSubstring.findMW("ADOBECODEBANC", "BC") === "BEC")
    assert(P26_MinimumWindowSubstring.findMW("ADOBECODEBANC", "BCE") === "BEC")
  }
}
