package leetcode.arrary

import scala.collection.mutable

/**

  Longest Consecutive Sequence
 
 Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
    *For example, given [100, 4, 200, 1, 3, 2], the longest consecutive elements sequence should be
    *[1, 2, 3, 4]. Its length is 4.
 
 Your algorithm should run in O(n) complexity.
 *
 */
object P17_LongestConsecutiveSeq {
  def findLCS(arr: List[Int]): Int = {
    require(arr.size >= 2)
    
    val hs = new mutable.HashSet[Int]()
    arr.foreach(e => hs.add(e))
    // e is in the middle a consecutive seq
    val lr_hs = new mutable.HashSet[Int]()
    arr.foreach {
      case e if hs.contains(e+1) && hs.contains(e-1) => lr_hs.add(e)
      case e => ()
    }
    // end points *2 and break points if any
    val nOfConsecutivePoints = lr_hs.filterNot(lre => lr_hs.contains(lre-1) && lr_hs.contains(lre+1)) match {
      case ps if ps.size > 2 =>
        val pslist = ps.toList.sorted
        pslist.zipWithIndex.collect {case (n, i) if i%2!=0 => n - pslist(i-1)}.max +1
      case _ =>
        lr_hs.size
    }
  
    // + begin + end
    nOfConsecutivePoints +2
  }
}
