package leetcode.arrary

/**

  Remove Duplicates from Sorted Array
   
  Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
  Do not allocate extra space for another array, you must do this in place with constant memory.
  For example, given input array A = [1,1,2], your function should return length = 2,
  and A is now [1,2].
  
  */
object P21_RemoveDupsFromSorted {
  def unique(arr: List[Int]): List[Int] = {
    for {
      (e, i) <- arr.zipWithIndex
      if i== 0 || e != arr(i-1)
    } yield e
  }
}
