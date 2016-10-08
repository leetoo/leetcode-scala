package leetcode.arrary

/**
  * Reverse Words in a String
  * Given an input string, reverse the string word by word.
  * For example, given s = "the sky is blue", return "blue is sky the".
  *
  */
object P27_ReverseWordsInString {
  def reverseWords(s:String): String = {
    // require: trim-ed s
    s.foldLeft((new StringBuilder, new StringBuilder)) {
      case ((accS, accW), c) if c == ' ' && accS.nonEmpty =>
        (accW.append(" ").append(accS), new StringBuilder)
      case ((accS, accW), c) if c == ' ' =>
        (accW.append(accS), new StringBuilder)
      case ((accS, accW), c) =>
        (accS, accW.append(c))
    } match {
      case (accS, accW) if accS.isEmpty =>  // funny accS.isEmpty instead of accW.isEmpty
        accW.toString()
      case (accS, accW) =>
        accW.append(" ").append(accS).toString()
    }
  }
}
