package leetcode.arrary

import scala.collection.mutable

/**
  **
  *Contains Duplicate II
  **
  *Given an array of integers and an integer k,
  *return true if and only if there are two distinct indices i and j in the array such that
  *nums[i] = nums[j] and the difference between i and j is at most k.
  *
  *
  */
object P19_ContainsDuplicate2 {
  def findDuplicate(arr: List[Int], k: Int): Boolean = {
    var any_duplicate = false
    val hs = mutable.HashSet[(Int, Int)]()
    for (
      tp <- arr.zipWithIndex if !any_duplicate
    ) {
      hs.find(_._1 == tp._1) match {
        case Some((d, idxD)) if (tp._2 - idxD <= k) =>
          any_duplicate = true
        case Some(_) => ()
        case None =>
          hs.add(tp)
      }
    }
    any_duplicate
  }
  
  /**
    * withFilter version works
    */
  def findDuplicateV2(arr: List[Int], k: Int): Boolean = {
    var any_duplicate = false
    val hs = mutable.HashSet[(Int, Int)]()
    arr.zipWithIndex
      .withFilter(_ => !any_duplicate)
      .map {
        case tp @ (e, idx) =>
          hs.find(_._1 == tp._1) match {
            case Some((d, idxD)) if (tp._2 - idxD <= k) =>
              any_duplicate = true
            case Some(_) => ()
            case None =>
              hs.add(tp)
          }
      }
    any_duplicate
  }
  
  
}
