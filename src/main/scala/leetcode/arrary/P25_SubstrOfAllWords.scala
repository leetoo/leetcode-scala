package leetcode.arrary

import scala.collection.mutable

/**
  * Substring with Concatenation of All Words
  **
  *You are given a string, s, and a list of words, words, that are all of the same length.
  *Find all starting indices of substring(s) in s that is a concatenation of
  *each word in words exactly once and without any intervening characters.
  *
  */
object P25_SubstrOfAllWords {
  def findSubstr(str: String, words: List[String]): List[Int] = {
    require(words.nonEmpty && words.forall(_.length == words.head.length))
    
    val wlen = words.head.length
    val hs = mutable.HashSet[String]()
    words.foreach(hs.add)
    
    var strz = str.zipWithIndex.toList
    var indexes = List.empty[Int]
    while (strz.nonEmpty) {
      val af = strz.dropWhile { case (c, i) =>
        val si = strz.head._2
         ! strz.slice(i - si, i - si + wlen * words.size).grouped(wlen).toList
          .map(_.map(_._1).mkString)
          .forall(hs.contains)
      }
      if(af.nonEmpty) {
        indexes = af.head._2 :: indexes
        strz = af.takeRight(af.size - wlen * words.size) match {
          case st if st.length < wlen * words.size => Nil
          case st => st
        }
      } else {
        strz = Nil
      }
  
    }
    indexes
  }
}
