package leetcode.recursion

/**

  Combinations
  Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
  https://leetcode.com/problems/combinations/
    
  For example, if n = 4 and k = 2, a solution is:
    [
      [2,4], [3,4], [2,3], [1,2], [1,3], [1,4]
    ]
  
  */
object P2_CombinationsK {
  
  // rec: enu(arr, k)
  def enu0(arr: List[Int], k:Int): List[List[Int]] = {
    require(arr.size >= k)
    if (k == 1) return arr.map(n => List(n))
    if (arr.size == k) return List(arr)
    enu0(arr.tail, k-1).map(sl => arr.head::sl) ++ enu0(arr.tail, k)
  }
  
  // rec: enu_tailrec(arr, (k, idx++), (kList, kpList)) ?
  
}
