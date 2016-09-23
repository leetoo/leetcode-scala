package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P15_LongestValidParenthesesSpec extends FlatSpec with Matchers {

    "P15_LongestValidParentheses" should "findLongest valid parenthesis works" in {
    assert(P15_LongestValidParentheses.findLongest("(()()[") === "()()")
    assert(P15_LongestValidParentheses.findLongest("(()[") === "()")
    assert(P15_LongestValidParentheses.findLongest("]{}(()[") === "{}")
  }
  
  it should "splitWith works" in {
    assert(
      P15_LongestValidParentheses.splitWith0(
        List(false, true, true, false, true, true, false), identity[Boolean]
      ) === List(List(true, true), List(true, true)))
    assert(
      P15_LongestValidParentheses.splitWith0(List(false, true, true, false), identity[Boolean])
        === List(List(true, true)))
    assert(
      P15_LongestValidParentheses.splitWith0(List(false, false), identity[Boolean])
        === Nil)
    assert(
      P15_LongestValidParentheses.splitWith0(List("","{","}", "", "(", ")", "")
      , (s: String) => s.nonEmpty)
        === List(List("{","}"), List("(", ")")))
    
  }
}
