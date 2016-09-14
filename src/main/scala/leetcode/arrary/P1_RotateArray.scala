package leetcode.arrary

/**
    Rotate an array of n elements to the right by k steps.

    For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7]
    is rotated to [5,6,7,1,2,3,4]. How many different ways do you know to solve this problem?
  
  */
object P1_RotateArray {
  def rotate(arr: Seq[Int], k: Int) :Seq[Int] = {
    arr.splitAt( (arr.size - k % arr.size).abs ) match {
      case (bk, ak) => ak ++ bk
    }
  }
}
