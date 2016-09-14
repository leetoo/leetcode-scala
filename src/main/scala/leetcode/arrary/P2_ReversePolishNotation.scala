package leetcode.arrary

/**
  
 Evaluate Reverse Polish Notation
 
 Evaluate the value of an arithmetic expression in Reverse Polish Notation.
  *Valid operators are +, -, *, /. Each operand may be an integer or another expression.
  *For example:
 
 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 *
 */

object P2_ReversePolishNotation {
  
  private[this] val List(plus ,minus, mul, div) = List("+", "-", "*", "/")
  
  def calculate(arr: List[String]): Int = {
    var operands = List.empty[String]
    arr.foreach {
      case `plus` =>
        operands = (operands(1).toInt + operands(0).toInt).toString :: operands.takeRight(operands.size - 2)
      case `minus` =>
        operands = (operands(1).toInt - operands(0).toInt).toString :: operands.takeRight(operands.size - 2)
      case `mul` =>
        operands = (operands(1).toInt * operands(0).toInt).toString :: operands.takeRight(operands.size - 2)
      case `div` =>
        operands = (operands(1).toInt / operands(0).toInt).toString :: operands.takeRight(operands.size - 2)
      case n =>
        operands = n :: operands
    }
    operands(0).toInt
  }
  
}
