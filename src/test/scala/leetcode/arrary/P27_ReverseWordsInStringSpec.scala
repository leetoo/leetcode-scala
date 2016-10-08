package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P27_ReverseWordsInStringSpec extends FlatSpec with Matchers {
  "reverseWords" should "" in {
    assert(P27_ReverseWordsInString.reverseWords("the sky is blue") === "blue is sky the")
    assert(P27_ReverseWordsInString.reverseWords("the  sky") === "sky  the")
    assert(P27_ReverseWordsInString.reverseWords("the") === "the")
  }
}
