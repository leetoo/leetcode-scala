package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P2_ReversePolishNotationSpec extends FlatSpec with Matchers {
  
  "ReversePolishNotation" should "calculate works" in {
    assert(P2_ReversePolishNotation.calculate(List("2", "1", "+", "3", "*")) === 9)
    assert(P2_ReversePolishNotation.calculate(List("4", "13", "5", "/", "+")) === 6)
  }
}
