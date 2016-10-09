package leetcode.arrary

import scala.annotation.tailrec

/**
  **
  *Search in Rotated Sorted Array
  **
  *Suppose a sorted array is rotated at some pivot unknown to you beforehand.
  *(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
  **
  *You are given a target value to search. If found in the array return its index,
  *otherwise return -1. You may assume no duplicate exists in the array.
  *
 */
object P29_SearchSortedArray {
  def findInSorted(arr: Array[Int], t: Int): Int = {

    @tailrec
    def findIn(i: Int, j: Int): Int = {
      j-1-i match {
        case 1 | 2 =>
          arr.slice(i, j).indexOf(t) match {
            case idx if idx >=0 => idx +i
            case _ => -1
          }
        case _ =>
          val mid = (i + j) /2
          if(arr(i) > t) {
            if(arr(mid) < t) {
              findIn(mid, j)
            } else {
              if(arr(j-1) > t) {
                findIn(i, mid)
              } else {
                findIn(mid, j)
              }
            }
          } else {
            findIn(i, mid)
          }
      }
    }
    findIn(0, arr.length)
  }
}
