package leetcode.arrary

import scala.collection.mutable

/**
  * Minimum Window Substring
  **
  *Given a string S and a string T,
  *find the minimum window in S which will contain all the characters in T in complexity O(n).
  *For example, S = "ADOBECODEBANC", T = "ABC", Minimum window is "BANC".
  *
  */
object P26_MinimumWindowSubstring {
  // init with range: [1st elem in T, last elem in T]
  // shift the range step by step to right
  def findMW(s:String, t:String): String = {
    val szi = s.zipWithIndex
    val ts = t.toSet
    val hs = mutable.HashSet[Char]()
    t.foreach(c => hs.add(c))
    val initRange = szi.takeWhile {
      case (c, i) if hs.isEmpty =>
        false
      case (c,i) =>
        if(hs.contains(c)) hs.remove(c)
        true
    }.dropWhile {
      case (c, i) => !ts.contains(c)
    }
    
    var minimumLen = initRange.size
    var minimumWindow = initRange
    var loopRange = initRange
    while (loopRange.last._2 < szi.last._2) {
      val remainRange = szi.drop(loopRange.head._2).tail.dropWhile(tp => !ts.contains(tp._1))
      val lastIdx = math.max(
        szi.indexWhere(tp => tp._1==loopRange.head._1 && tp._2 > remainRange.head._2),
        loopRange.last._2
      )
      val newLen = lastIdx - remainRange.head._2 + 1
      loopRange = szi.slice(remainRange.head._2, lastIdx+1)
      if(newLen < minimumLen) {
        minimumLen = newLen
        minimumWindow = loopRange
      }
      
    }
    minimumWindow.map(_._1).mkString
  }
  
}
