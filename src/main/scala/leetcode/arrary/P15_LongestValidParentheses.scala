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
  
  implicit class ImplicitCollectionWithSplitWith[A](es: List[A]) {
    def splitWith(f: A => Boolean): List[List[A]] = {
      splitWith0(es, f)
    }
  }
  
  def findLongest(ps: String): String = {
    val d = Map("(" -> ")", "[" -> "]", "{" -> "}")
    val dr = d.map(_.swap)
    ps.map(_.toString).zipWithIndex
      .foldLeft((List[(String, Int)](), List.fill(ps.length)(true))) {
        case ((stack, flags), (c, idxC)) if d.contains(c) =>
          // push `left operand` to stack
          ((c, idxC)::stack, flags)
        case ((stack, flags), (c, idxC)) if dr.get(c) == stack.headOption.map(_._1) =>
          // pop matched
          (stack.tail, flags)
        case ((stack, flags), (c, idxC)) =>
          // invalid c
          if(stack.nonEmpty) {
            (stack.tail, flags.updated(idxC, false)
              .updated(stack.head._2, false))
          } else {
            (Nil, flags.updated(idxC, false))
          }
      } match { case (stack, flags) =>
      // left invalid operands
      stack.foldLeft(flags) {
        case (fs, (ic, idxIc)) => fs.updated(idxIc, false)
      }.zipWithIndex.map {
        case (b, i) if b =>
          ps.map(_.toString).apply(i)
        case (b, i)  => ""
      }.splitWith((c: String) => c.nonEmpty)
        .maxBy(_.size).mkString
    }
  }
  
  // flags => splitWith
  def splitWith0[A](es: List[A], f: A => Boolean): List[List[A]] = {
    es.zipWithIndex.foldLeft(List[List[A]]()) {
      case (acc, (e, idx)) if f(e) =>
        if(idx == 0 || acc.isEmpty) {
          List(List(e))
        } else if(f(es(idx-1))){
          (e::acc.head) :: acc.tail
        } else {
          List(e) :: acc
        }
      case (acc, _) => acc
    }.map(_.reverse).reverse
  }
  
}
