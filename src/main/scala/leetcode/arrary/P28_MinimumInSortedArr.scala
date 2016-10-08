package leetcode.arrary

/**

Find Minimum in Rotated Sorted Array
  Suppose a sorted array is rotated at some pivot unknown to you beforehand.
  (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
  Find the minimum element.You may assume no duplicate exists in the array.
  
  */
object P28_MinimumInSortedArr {
  def findMinimum(arr: List[Int]): Int = {
    val arrz = arr.zipWithIndex
    arrz.indexWhere({
      case (i,idx) => i < arrz(idx-1)._1
    }, 1) match {
      case idx if idx == -1 =>
        arr.head
      case idx =>
        arr(idx)
    }
  }
}
