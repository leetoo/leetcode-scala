package leetcode.arrary

/**

  Merge Sorted Array
   
  Given two sorted integer arrays A and B, merge B into A as one sorted array.
  
  Note: You may assume that A has enough space to hold additional elements from B.
  The number of elements initialized in A and B are m and n respectively.
  
  */
object P14_MergeSorted {
  
  def mergeSorted(arrA: List[Int], arrB: List[Int]): List[Int] = {
    (1 to (arrA.size +arrB.size)).foldLeft((arrA, arrB, List[Int]())){
      case ((Nil , b@ hb::_, merged), _)  => (Nil, Nil, b ++ merged)
      case ((a@ ha::_ ,Nil, merged), _) => (Nil, Nil, a ++ merged)
      case ((Nil ,Nil, merged), _) => (Nil, Nil, merged)
      case ((a ,b, merged), _) if a.head > b.head =>
        (a, b.tail, b.head :: merged)
      case ((a ,b, merged), _) if a.head <= b.head =>
        (a.tail, b, a.head :: merged)
    }._3.reverse
  }
  
}
