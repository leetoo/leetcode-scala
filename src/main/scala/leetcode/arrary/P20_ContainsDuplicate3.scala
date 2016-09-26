package leetcode.arrary

import scala.collection.mutable

/**

  Contains Duplicate III
   
  Given an array of integers, find out whether there are two distinct indices i and j
  in the array such that the difference between nums[i] and nums[j] is at most t and
  the difference between i and j is at most k.
  
  */
object P20_ContainsDuplicate3 {
  def findDuplicate(nums: List[Int], t: Int,  k: Int): Boolean = {
    val hs = mutable.HashSet[(Int, Int)]()
    nums.zipWithIndex.exists {
      case (n, i) =>
        val p = hs.exists(tp => ( tp._1 - n ).abs <= t && i - tp._2 <= k)
        hs.add((n,i))
        p
    }
  }
}
