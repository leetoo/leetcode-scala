package leetcode.recursion

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P2_CombinationsKSpec extends FlatSpec with Matchers{
  
  "P2_CombinationsK" should "enu0 works" in {
    
    assert(P2_CombinationsK.enu0(List(1,2,3), 1).sortBy(_.head) ===
      List(List(1), List(2), List(3)).sortBy(_.head))
  
    assert(P2_CombinationsK.enu0(List(2,1,3), 2).sortBy(_.head) ===
      List(List(2, 1), List(1,3), List(2,3)).sortBy(_.head))
  
    assert(P2_CombinationsK.enu0(List(1,2,3,4), 4).sortBy(_.head) ===
      List(List(1,2,3,4)).sortBy(_.head))
  }
  
}
