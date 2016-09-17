package leetcode.arrary

/**
  
  Two Sum
  
    Given an array of integers, find two numbers such that they add up to a specific target number.
    
    The function twoSum should return indices of the two numbers such that
    they add up to the target, where index1 must be less than index2.
    Please note that your returned answers (both index1 and index2) are not zero-based.
  
    For example:
  
    Input: numbers={2, 7, 11, 15}, target=9
    Output: index1=0, index2=1
    
  */
object P6_TwoSum {
  def findTwoSum(numbers: List[Int], target: Int): Option[(Int, Int)] = {
    val ht = numbers.zipWithIndex
    val hm = ht.toMap
    // note hm is not fix-ordered, could bring unexpected result when find
    // see test case with negative number
    ht.find(tp =>  hm.get(target - tp._1).nonEmpty) match {
      case Some((n, idx)) => hm.get(target - n).map(idxC => (idx, idxC))
      case _ => None
    }
  }
}
