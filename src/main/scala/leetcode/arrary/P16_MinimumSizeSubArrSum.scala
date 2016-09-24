package leetcode.arrary

/**

    Minimum Size Subarray Sum
     
    Given an array of n positive integers and a positive integer s,
    find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.
    
    For example, given the array [2,3,1,2,4,3] and s = 7,
    the subarray [4,3] has the minimal length of 2 under the problem constraint.
  
  */
object P16_MinimumSizeSubArrSum {
  
  def findSubArr(arr: List[Int], s: Int): Int = {
    arr.zipWithIndex.foldLeft(arr.size) {
      case (lth, (n, idx)) =>
        val afn = arr.splitAt(idx)._2
        afn.zipWithIndex.takeWhile {
          case (m, idxm) => idxm+1 < lth || afn.take(idxm+1).sum <= s
        } match {
          case subarr if subarr.map(_._1).sum >= s => subarr.size
          case _ => lth
        }
    } match {
      case l if l==arr.size && arr.sum<s => 0
      case l => l
    }
  }
  
}
