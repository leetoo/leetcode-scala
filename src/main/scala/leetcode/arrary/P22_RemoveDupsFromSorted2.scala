package leetcode.arrary

/**

  Remove Duplicates from Sorted Array II
   
  Follow up for "Remove Duplicates": What if duplicates are allowed at most twice?
  For example, given sorted array A = [1,1,1,2,2,3], your function should return length = 5,
  and A is now [1,1,2,2,3]. So this problem also requires in-place array manipulation.
    
  */

object P22_RemoveDupsFromSorted2 {
  def unique2(arr: List[Int]): List[Int] = {
    for {
      (e, i) <- arr.zipWithIndex
      if i<= 1 || e != arr(i-2)
    } yield e
  }
}
