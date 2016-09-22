package leetcode.arrary

/**
  **
  *Longest Valid Parentheses
  **
  *Given a string containing just the characters '(' and ')',
  *find the length of the longest valid (well-formed) parentheses substring.
  **
  *For "(()", the longest valid parentheses substring is "()", which has length = 2.
  *Another example is ")()())", where the longest valid parentheses substring is "()()",
  *which has length = 4.
  *
 */
object P15_LongestValidParentheses {
  
  def findLongest(ps: String): String = {
    val d = Map("(" -> ")", "[" -> "]", "{" -> "}")
    val dr = d.map(_.swap)
    
    ps.map(_.toString).zipWithIndex
      .foldLeft((List[String](), List[List[String]]())) {
        case ((stack, acc), (c, idxC)) if d.contains(c) =>
          // push `left operand` to stack
          (c :: stack, acc)
        case ((stack, acc), (c, idxC)) if dr.get(c) == stack.headOption =>
          // pop matched
          if(acc.nonEmpty) {
            (stack.tail, (List(stack.head, c) ++ acc.head) :: acc.tail )
          } else {
            (stack.tail, List(List(stack.head, c)))
          }
        case ((stack, acc), (c, idxC)) =>
          // pop dismatched
          if(stack.nonEmpty) {
            (stack.tail, List(stack.head, c) :: acc)
          } else {
            (Nil, List(c) :: acc)
          }
  } match { case (stack, acc) =>
      acc.maxBy(_.size).mkString
    }
  }
  
  // flags => splitWith
}
