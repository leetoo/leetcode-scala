package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P9_MergeIntervalsSpec extends FlatSpec with Matchers {
  
  "P9_MergeIntervals" should "merge works" in {
    assert(P9_MergeIntervals.merge(Seq((1,3),(2,6))) ===
      Seq((1,6)))
    assert(P9_MergeIntervals.merge(Seq((1,3),(4,6))) ===
      Seq((1,3),(4,6)))
    assert(P9_MergeIntervals.merge(Seq((1,3),(4,6), (2,7))) ===
      Seq((1,7)))
    assert(P9_MergeIntervals.merge(Seq((4,6), (2,5))) ===
      Seq((2, 6)))
    assert(P9_MergeIntervals.merge(Seq((1,3),(2,6),(8,10),(15,18))) ===
      Seq((1,6),(8,10),(15,18)))
  }
  
}
