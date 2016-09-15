package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P5_WordBreak2Spec extends FlatSpec with Matchers{
  "P5_WordBreak2" should "parse works" in {
    
    assert(P5_WordBreak2.parse("leetcode", List("leet", "code")).toSet === List("leet code").toSet)
    assert(P5_WordBreak2.parse("leetcode", List("lee", "code")) === List())
    
    assert(P5_WordBreak2.parse("leetcode", List("lee", "tc", "ode","leet", "code")).toSet
      === List("leet code", "lee tc ode").toSet)
//
    assert(P5_WordBreak2.parse("catsanddog", List("cat", "cats", "and", "sand", "dog")).toSet
      === List("cats and dog", "cat sand dog").toSet)
    
    
  }
}
