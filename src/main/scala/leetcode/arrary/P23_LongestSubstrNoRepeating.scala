package leetcode.arrary

import scala.collection.mutable

/**
 **
 Longest Substring Without Repeating Characters (Java)
 **
 Given a string, find the length of the longest substring without repeating characters.
  *For example, the longest substring without repeating letters for "abcabcbb" is "abc",
  *which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 *
 */

object P23_LongestSubstrNoRepeating {
  def lgestSubstr(str: String): Int = {
    require(str.nonEmpty)
    val strz = str.zipWithIndex
    strz.foldLeft(1) {
      case (len, (c, i)) =>
        val hs = mutable.HashSet[Char]()
        val (_, af) = strz.splitAt(i)
        val uniqs = af.takeWhile {
          case (c2, i2) if hs.contains(c2) =>
            hs.clear()
            false
          case (c2, i2) =>
            hs.add(c2)
            true
        }
        math.max(len, uniqs.size)
    }
  }
}
