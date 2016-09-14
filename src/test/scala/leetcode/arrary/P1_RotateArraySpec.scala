package leetcode.arrary

import org.scalatest._

class P1_RotateArraySpec extends FlatSpec with Matchers {
  
  "RotateArraySpec" should "rotate works"in {
    assert(P1_RotateArray.rotate(1 to 7, 3) === Seq(5,6,7,1,2,3,4))
  }
  
  it should "rotate works with corner cases" in {
    assert(P1_RotateArray.rotate(1 to 7, 0) === (1 to 7))
    assert(P1_RotateArray.rotate(1 to 7, 7) === (1 to 7))
    assert(P1_RotateArray.rotate(1 to 7, 8) === Seq(7,1,2,3,4,5,6))
  }
  
}
