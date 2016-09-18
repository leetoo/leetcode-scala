package leetcode.arrary

/**

    Word Break II
  
    Given a string s and a dictionary of words dict,
    add spaces in s to construct a sentence where each word is a valid dictionary word.
    Return all such possible sentences. For example,
    given s = "catsanddog", dict = ["cat", "cats", "and", "sand", "dog"],
    the solution is ["cats and dog", "cat sand dog"].
  
  */

object P5_WordBreak2 {
  
  def parse(st: String, dc: List[String]): Seq[String] = {
    val dict = dc.zip(1 to dc.size).toMap
    var flags = List.fill(st.length)(List[Int]())
    st.toList.zipWithIndex.foreach {
      case (c, idxC) if idxC == 0 || flags(idxC-1).nonEmpty =>
        val (_, afterC) = st.splitAt(idxC + 1)
        afterC.zip(1 to afterC.length).foreach {
          case (d, idxD) if dict.get(st.substring(idxC, idxC + idxD + 1)).nonEmpty =>
            // updated on word-end index while flags checked when next word starts
            if(idxC==0) {
              flags = flags.updated(idxC + idxD, idxC :: flags(idxC + idxD))
            } else {
              flags = flags.updated(idxC + idxD, idxC-1 :: flags(idxC + idxD))
            }
          case _ => ()
        }
      case (c, idxC) => ()
    }
  
    /**
      *
      * `flags` looks like
      ========
         0   1   2   3   4   5    6      7   8   9
        "c   a   t   s   a   n    d      d   o   g"
        []  []  [0] [0] []  []   [2 ,3]  []  []  [6]
      ========
      
     `wordsIndexCases` looks like
        List(List(0, 3, 6), List(0, 2, 6))
      ========
      */
    
    if(flags(st.length - 1).isEmpty){
      return Seq()
    }
    var wordsIndexCases = flags(st.length - 1).map(List(_))
    
    while(!wordsIndexCases.forall(cs => cs.head == 0)) {
      wordsIndexCases = wordsIndexCases.flatMap { lIdxs =>
        if(lIdxs.head != 0) {
          flags(lIdxs.head).map(llIdx => llIdx :: lIdxs)
        } else {
          List(lIdxs)
        }
      }
    }
    
    wordsIndexCases.map { wIdx =>
      (wIdx++List(st.length-1)).zipWithIndex.map {
        case (idx, i) if i>1 =>
          st.substring(wIdx(i-1)+1, idx+1)
        case (idx, i) if i==1 =>
          st.substring(wIdx(i-1), idx+1)
        case (idx, i) =>
          ""
      }.mkString(" ").trim
    }
  }
  
}
