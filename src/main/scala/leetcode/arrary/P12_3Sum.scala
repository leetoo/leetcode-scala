package leetcode.arrary

/**

  Problem:
  
  Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
  
  Note:
  Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
  The solution set must not contain duplicate triplets.
  
  For example, given array S = {-1 0 1 2 -1 -4}, A solution set is:
  (-1, 0, 1)
  (-1, -1, 2)
  
  */
object P12_3Sum {
  def find3Sums (ns: List[Int]): List[List[Int]] = {
    ns.zipWithIndex.foldLeft(List[List[Int]]()) {
      case (acc, (n, idx)) if idx == ns.size -3 =>
        if (ns.takeRight(3).sum ==0) {
          ns.takeRight(3) :: acc
        } else {
          acc
        }
      case (acc, (n, idx)) if idx > ns.size -3 => acc
      case (acc, (n, idx)) =>
        val ans = ns.takeRight(ns.size - idx -1)
        ans.combinations(2).withFilter(_.sum == -n).map(l => n::l).toList ++ acc
    }
  }
  
  
//  def find3SumsFor(ns: List[Int]) = {
//    for (
//      (n, idxn) <- ns.zipWithIndex;
//      (m, idxm) <- ns.takeRight(ns.size - idxn - 1).zip(idxn + 1 until ns.size);
//      (k, idxk) <- ns.takeRight(ns.size - idxm - 1).zip(idxm + 1 until ns.size)
//    ) yield (n,m,k)
//  }
  
  //  def find3Sums_rec
  // filter combinations with 3 elems whose sum is 0
  // ns.combinations(3).withFilter(_.sum==0).toList
  
}
