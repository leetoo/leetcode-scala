package leetcode.arrary

/**

  Given a string s and a dictionary of words dict,
  determine if s can be segmented into a space-separated sequence of one or more dictionary words.
  
  For example, given
  s = "leetcode",
  dict = ["leet", "code"].
  
  Return true because "leetcode" can be segmented as "leet code".
    
  */
object P4_WordBreak1 {
  def parse(st: String, dc: List[String]): Boolean = {
    val dict = dc.zip(1 to dc.size).toMap
    var flags = true :: List.fill(st.length-1)(false)
    st.toList.zip(0 until st.length).foreach {
      case (c, idxC) if idxC == 0 || flags(idxC-1) =>
        val (_, afterC) = st.splitAt(idxC + 1)
        afterC.zip(1 to afterC.length).foreach {
          case (d, idxD) if dict.get(st.substring(idxC, idxC + idxD + 1)).nonEmpty =>
            // updated on word-end index while flags checked when next word starts
            flags = flags.updated(idxC + idxD, true)
          case _ => ()
        }
      case (c, idxC) =>
        ()
    }
    // true is an word end flag except idxC==0
    flags.last && st.nonEmpty
  }
}
