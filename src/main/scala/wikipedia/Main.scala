package wikipedia

object Main extends App {

  // Rank
  //println(WikipediaRanking.rankLangsUsingIndex(WikipediaRanking.makeIndex(WikipediaRanking.langs,WikipediaRanking.wikiRdd)))

  println(WikipediaRanking.rankLangsReduceByKey(WikipediaRanking.langs,WikipediaRanking.wikiRdd))
}

