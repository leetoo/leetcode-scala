package leetcode.recursion

import scala.annotation.tailrec

/**
  Generate all combination of size k and less of adjacent numbers
 
  For example:
      *e.g 1,2,3,4 k = 2
      *1 2 3 4
      *12 3 4
      *1 23 4
      *1 2 3 34
      *12 34
  */
object P1_AllAdjacentCombination {
  
  // rec: gen(ns, 0++, k)
  def helper_gen(ns: List[Int], from: Int, k: Int): List[List[Int]] = {
    require(ns.size - from >= k)
    ns.splitAt(from) match {
      case (bf, af) if af.size == k => List(bf ++ List(af.mkString.toInt))
      case (bf, af) => helper_gen(ns, from+1, k) ++
        List(bf ++ List(af.take(k).mkString.toInt) ++ af.takeRight(af.size-k))
    }
  }
  
  //rec: gen(ns, 0++, k, ::Nil)
  @tailrec
  def helper_gen_acc(ns: List[Int], from:Int, k: Int, acc: List[List[Int]] = Nil): List[List[Int]] ={
    ns.splitAt(from) match {
      case (bf, af) if af.size < k => acc
      case (bf, af) => helper_gen_acc(
        ns,
        from+1,
        k,
        acc ++ List(bf ++ List(af.take(k).mkString.toInt) ++ af.takeRight(af.size-k))
      )
    }
  }
  
  def gen_answer0(ns: List[Int], k: Int): List[List[Int]] = {
    if(k==1) return List(ns)
    gen_answer0(ns, k-1) ++ helper_gen(ns, 0, k)
  }
  
  @tailrec
  def gen_answer1(ns: List[Int], k: Int, accu: List[List[Int]] = Nil): List[List[Int]] = {
    if(k==1) return List(ns)++accu
    gen_answer1(ns, k-1, accu ++ helper_gen_acc(ns, 0, k, Nil))
  }
  
}
