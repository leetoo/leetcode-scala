package leetcode.arrary

import scala.collection.mutable

/**
  **
  *Longest Substring with At Most K Distinct Characters
  *This is a problem asked by Google.
  *Given a string, find the longest substring that contains only two unique characters.
  *For example, given "abcbbbbcccbdddadacb",
  *the longest substring that contains 2 unique character is "bcbbbbcccb".
  *
  */

object P24_LongestSubstrWithKChars_Google {
  def lgestStr(str: String): String = {
    require(str.length >= 2 && str.toSet.size>=2)
    val strz = str.zipWithIndex
    strz.foldLeft("") {
      case (acc, (c, i)) =>
        val hs = mutable.HashSet[Char]()
        val (_, af) = strz.splitAt(i)
        val uniqs2 = af.takeWhile {
          case (c2, i2) if hs.contains(c2) =>
            true
          case (c2, i2) if hs.size < 2 =>
            hs.add(c2)
            true
          case _ =>
            hs.clear()
            false
        }
        List(acc, uniqs2.map(_._1).mkString)
          .maxBy(_.length)
    }
  }
}
