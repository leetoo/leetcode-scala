package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P25_SubstrOfAllWordsSpec extends FlatSpec with Matchers {
  "findSubstr" should "works" in {
    assert(P25_SubstrOfAllWords.findSubstr("barfoothefoobarman", List("foo", "bar"))
      === List(9, 0))
    
    assert(P25_SubstrOfAllWords.findSubstr("barfoo", List("foo", "bar"))
      === List(0))
  
    assert(P25_SubstrOfAllWords.findSubstr("barfoo", List("foo"))
      === List(3))
  
    assert(P25_SubstrOfAllWords.findSubstr("barhoge", List("foo"))
      === Nil)
  }
}
