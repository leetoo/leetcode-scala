package leetcode.arrary

/**
   
  Merge Intervals
     
  Given a collection of intervals, merge all overlapping intervals.

  For example,
    Given [1,3],[2,6],[8,10],[15,18],
    return [1,6],[8,10],[15,18].
 *
 */
object P9_MergeIntervals {
  type Interval = (Int, Int)
  def merge(inters: Seq[Interval]): Seq[Interval] = {
    // fold left to insert new interval to list
    inters.sortBy(_._1).foldLeft(Seq[Interval]()) {
      case (acc, inter) if acc.nonEmpty =>
        acc.take(acc.size - 1) ++ merge_ab(acc.last, inter)
      case (acc, inter) =>
        Seq(inter)
    }
  }
  
  def merge_ab(interA: Interval, interB: Interval): Seq[Interval] = {
    // ia begins with smaller lower bound
    val List(ia, ib) = List(interA, interB).sortBy(_._1)
    (ia, ib) match {
      case ((la, ra), (lb, rb)) =>
        if(ra < lb) {
          Seq(ia, ib)
        } else if (ra <= rb) {
          // merged interval (la, rb)
          Seq((la, rb))
        } else {
          //ra >lb
          Seq(ia)
        }
    }
  }
  
}
