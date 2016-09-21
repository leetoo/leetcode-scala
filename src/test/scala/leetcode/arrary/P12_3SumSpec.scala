package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P12_3SumSpec extends FlatSpec with Matchers {
  
  "P12_3Sum" should "find3Sums works" in {
    assert(P12_3Sum.find3Sums(List(-1, 0, 1, 2, -1, -4)).map(_.toSet).toSet
      ===  List(List(-1, 0, 1), List(-1, -1, 2)).map(_.toSet).toSet
    )
  }
}
