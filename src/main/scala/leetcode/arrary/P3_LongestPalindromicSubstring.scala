package leetcode.arrary

/**
  * Find the Longest Palindromic Substring
  *
  * For example, "dabcba" => "abcba"
  */
object P3_LongestPalindromicSubstring {
  def findPS(os: String) = {
    def isPS(s: String): Boolean = s == s.reverse
    val idxedS = os.zipWithIndex
    val idxDict = idxedS
      .groupBy[Char]{ case (c, idx) => c }
      .map {case (c, tps) => (c, tps.map(_._2).sorted.reverse)}
    var (psLength, psStr) = (1, "")
    idxedS.foreach { case (c, idx) =>
      idxDict(c).takeWhile(_ > idx).foreach { nIdx =>
        os.substring(idx, nIdx + 1) match {
          case subS if isPS(subS) && nIdx-idx > psLength =>
            psLength = nIdx - idx + 1
            psStr = subS
          case _ => ()
        }
      }
    }
    psStr
  }
}
