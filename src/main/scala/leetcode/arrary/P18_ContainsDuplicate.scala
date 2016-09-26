package leetcode.arrary

import scala.collection.mutable

/**
  **
  *Contains Duplicate
  **
  *Given an array of integers, find if the array contains any duplicates.
  *Your function should return true if any value appears at least twice in the array,
  *and it should return false if every element is distinct.
  *
  */
object P18_ContainsDuplicate {
  def findDuplicates(arr: List[Int]) :List[Int] = {
    arr.foldLeft((mutable.HashSet[Int](), List[Int]())) {
      case ((hs, acc), n) if hs.contains(n) =>
        (hs, n::acc)
      case ((hs, acc), n) =>
        hs.add(n)
        (hs, acc)
    } match { case (_, acc) => acc }
  }
}
