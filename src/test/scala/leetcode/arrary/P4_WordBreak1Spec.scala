package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P4_WordBreak1Spec extends FlatSpec with Matchers{
  "P4_WordBreak1" should "parse works" in {
    assert(P4_WordBreak1.parse("leetcode", List("leet", "code")) === true)
    assert(P4_WordBreak1.parse("leetcode", List("lee", "code")) === false)
    assert(P4_WordBreak1.parse("leettcode", List("leett", "code")) === true)
    assert(P4_WordBreak1.parse("leettcode", List("leettcode")) === true)
    assert(P4_WordBreak1.parse("leettcod", List("lee", "tt", "cod")) === true)
  }
}
