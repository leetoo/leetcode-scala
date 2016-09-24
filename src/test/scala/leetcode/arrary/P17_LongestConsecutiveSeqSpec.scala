package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P17_LongestConsecutiveSeqSpec extends FlatSpec with Matchers {
  "P17_LongestConsecutiveSeq" should "findLCS works" in {
    assert(P17_LongestConsecutiveSeq.findLCS(List(1,2,100,4,3)) === 4)
    assert(P17_LongestConsecutiveSeq.findLCS(List(1,2,100,4,3,8,9,10,11,12)) === 5)
    assert(P17_LongestConsecutiveSeq.findLCS(List(1,2)) === 2)
  }
}
