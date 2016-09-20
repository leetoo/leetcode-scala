package leetcode.recursion

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P1_AllAdjacentCombinationSpec extends FlatSpec with Matchers {
  
  "P1_AllAdjacentCombination" should "gen_answer0 works" in {
    assert(P1_AllAdjacentCombination.gen_answer0(List(1,2,3), 2).sortBy(_.head) ===
      List(List(1,2,3), List(12,3), List(1,23)).sortBy(_.head))
    assert(P1_AllAdjacentCombination.gen_answer0(List(1,2,3), 1) ===
      List(List(1,2,3)).sortBy(_.head))
    assert(P1_AllAdjacentCombination.gen_answer0(1 to 100 toList, 2).size === 100)
  }
  
  it should "gen_answer1 with tailrec works" in {
    assert(P1_AllAdjacentCombination.gen_answer1(List(1,2,3), 2).sortBy(_.head) ===
      List(List(1,2,3),List(12,3), List(1,23)).sortBy(_.head))
    assert(P1_AllAdjacentCombination.gen_answer1(List(1,2,3), 1).sortBy(_.head) ===
      List(List(1,2,3)).sortBy(_.head))
    assert(P1_AllAdjacentCombination.gen_answer1(1 to 100 toList, 2).size === 100)
  }
  
}
