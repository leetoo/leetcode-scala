package leetcode.arrary

/**

  Two Sum III – Data structure design
   
    Design and implement a TwoSum class. It should support the following operations: add and find.
    
    add - Add the number to an internal data structure.
    find - Find if there exists any pair of numbers which sum is equal to the value.
    
    For example,
    
    add(1);
    add(3);
    add(5);
    find(4) -> true
    find(7) -> false
  
  */
object P8_TwoSum3_ClassDesign {
  
  case class TwoSum(elems: List[Int] = Nil)  {
    def add(i: Int): TwoSum = {
      TwoSum(i :: elems)
    }
    def find(i: Int): Boolean = {
      P6_TwoSum.findTwoSum(elems, i).nonEmpty
    }
  }
  
}
