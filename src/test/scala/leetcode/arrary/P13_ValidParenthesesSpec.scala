package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P13_ValidParenthesesSpec extends FlatSpec with Matchers {
  "P13_ValidParentheses" should "checkValidParentheses works" in {
    assert(P13_ValidParentheses.checkValidParentheses("()") === true)
    assert(P13_ValidParentheses.checkValidParentheses("[]") === true)
    assert(P13_ValidParentheses.checkValidParentheses("{}") === true)
    assert(P13_ValidParentheses.checkValidParentheses("{[()()[]{()}]}") === true)
    assert(P13_ValidParentheses.checkValidParentheses("{[()]{([)}]}") === false)
  }
}
