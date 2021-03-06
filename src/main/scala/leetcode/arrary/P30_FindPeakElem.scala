package leetcode.arrary

/**

  Find Peak Element
   
  A peak element is an element that is greater than its neighbors.
  Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
  The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
  
  You may imagine that num[-1] = num[n] = -∞. For example,
  in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
    
  */
object P30_FindPeakElem {
  def indexPeaks(arr: List[Int]): List[Int] = {
    val last = arr.size - 1
    arr.zipWithIndex.foldLeft(List.empty[Int]) {
      case (acc, (e, i)) if i > 0 && i< last =>
        if (e > arr(i-1) && e > arr(i+1)) {
          e::acc
        } else {
          acc
        }
      case (acc, _) => acc
        
    }
  }
}
