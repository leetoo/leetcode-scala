package leetcode.arrary

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class P29_SearchSortedArraySpec extends FlatSpec with Matchers {
  "findInSorted" should "works" in {
    assert(P29_SearchSortedArray.findInSorted(Array[Int](4,5,6,7,0,1,2), 3) === -1)
    assert(P29_SearchSortedArray.findInSorted(Array[Int](4,5,6,7,0,1,2), 2) === 6)
    assert(P29_SearchSortedArray.findInSorted(Array[Int](4,7,0,1,2,3), 2) === 4)
    assert(P29_SearchSortedArray.findInSorted(Array[Int](4,7,0,1,2,3), 4) === 0)
    assert(P29_SearchSortedArray.findInSorted(Array[Int](4,7,0,1,2,3), 6) === -1)
    
  }
}
