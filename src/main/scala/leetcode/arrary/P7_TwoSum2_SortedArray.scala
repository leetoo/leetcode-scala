package leetcode.arrary

/**

    Two Sum II – Input array is sorted
     
    This problem is similar to Two Sum except the input array is sorted.
  
  */
object P7_TwoSum2_SortedArray {
  
  def findTwoSum(numbers: List[Int], target: Int): Option[(Int, Int)] = {
    require(numbers.sorted == numbers, "input array should be sorted")
    val arr = numbers.zipWithIndex
    val arrRev = arr.reverse
    arr.find { case (n, idx) =>
      arrRev.exists(tp => tp._1 == target - n)
    } match {
      case Some((n, idx)) =>
        arrRev.find(tp => tp._1 == target - n).map { case (nC, idxC) => (idx, idxC) }
      case _ => None
    }
    
  }
}
