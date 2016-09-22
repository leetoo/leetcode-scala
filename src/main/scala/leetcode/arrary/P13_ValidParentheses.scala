package leetcode.arrary

import scala.util.Try

/**
  * Valid Parentheses
  *
  * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
  * determine if the input string is valid.
  *
  * The brackets must close in the correct order, "()" and "()[]{}" are all valid
  * but "(]" and "([)]" are not.
  *
  */
object P13_ValidParentheses {
  
  def checkValidParentheses(ps: String): Boolean = {
    val d = Map("(" -> ")", "[" -> "]", "{" -> "}")
    val dr = d.map(_.swap)
    Try {
      ps.map(_.toString).foldLeft(List[String]()) {
        case (stack, c) if d.contains(c) =>
          c :: stack
        case (stack, c) if dr.get(c) == stack.headOption =>
          stack.tail
        case _ => throw new Exception("unexpected")
      }
    }.isSuccess
  }
  
}
