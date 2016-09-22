package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P15_LongestValidParenthesesSpec extends FlatSpec with Matchers {
  "P15_LongestValidParentheses" should "findLongest valid parenthesis works" in {
    assert(P15_LongestValidParentheses.findLongest("(()()[") === "()()")
    assert(P15_LongestValidParentheses.findLongest("(()[") === "()")
//    assert(P15_LongestValidParentheses.findLongest("]{}(()[") === "{}")
  }
}
