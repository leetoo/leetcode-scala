package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P10_InsertIntervalsSpec extends FlatSpec with Matchers {
  
  "P10_InsertIntervals" should "merge works" in {
    assert(P10_InsertIntervals.mergeInterval(List((1,3)), (2,6)) === List((1,6)))
    
    assert(P10_InsertIntervals.mergeInterval(List((1,3),(4,6)), (2,7)) ===
      List((1,7)))

    assert(P10_InsertIntervals.mergeInterval(List((1,3), (6, 9)), (2,5)) === List((1,5), (6,9)))

    assert(P10_InsertIntervals.mergeInterval(List((1,3), (6, 9)), (2,5)) === List((1,5), (6,9)))

    assert(P10_InsertIntervals.mergeInterval(List((1,2),(3,5),(6,7),(8,10),(12,16)), (4,9))
      === List((1,2),(3,10),(12,16)))
  }
  
}
