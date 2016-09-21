package leetcode.arrary

import scala.collection.mutable

/**
  **
  *Isomorphic Strings (Java)
  **
  *Given two strings s and t, determine if they are isomorphic.
  *Two strings are isomorphic if the characters in s can be replaced to get t.
  *For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
  *
  */
object P11_IsomorphicStrings {
  def ifIso(s: String, t: String): Boolean = {
    require(s.length == t.length)
    val m = mutable.Map[Char, Char]()
    s.zip(t).find {
      case (cs, ct) if m.get(cs).isEmpty || m.get(cs).contains(ct) =>
        m(cs) = ct
        false
      case (cs, ct) => true
    } match {
      case Some(_) => false
      case None => true
    }
  }
}
