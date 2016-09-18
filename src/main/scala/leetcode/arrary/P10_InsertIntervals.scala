package leetcode.arrary

/**

  Insert Interval
  
  Given a set of non-overlapping & sorted intervals, insert a new interval into the intervals (merge if necessary).
  
    Example 1:
    Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
    
    Example 2:
    Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].
    
    This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
    
  */
object P10_InsertIntervals {
  type Interval = (Int, Int)
  
  val merge = P9_MergeIntervals.merge _
  
  def mergeInterval(mergedInters: List[Interval], newInterval: Interval): List[Interval] = {
    // not quite necessary to split, simply avoid computing again for `intersBefore`
    mergedInters.splitAt(mergedInters.indexWhere(_._1 > newInterval._1)) match {
      case (intersBefore, intersAfter) if intersBefore.nonEmpty =>
        intersBefore.take(intersBefore.size -1 ) ++ merge(intersBefore.last :: newInterval :: intersAfter)
      case (intersBefore, intersAfter) =>
        merge(newInterval :: intersAfter) toList
    }
    
  }
}
