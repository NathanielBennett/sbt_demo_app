package com.gu.core

class ApiLikeThing(url: String, someAuthThing: String) {

  def getDrummerList(genre: String): List[String] = {

    val classic = List("Charlie Watts", "John Densmore")
    val reallyClassic = List("Remi", "Meg White", "Kenny Arronof")
    val jazz =  List("Art Blakey", "Buddy Rich", "Tony Williams")
    val debatable = List("Ringo Starr")

    genre match {
      case "jazz" => jazz
      case "rock" => classic
      case "indie" => reallyClassic
      case _ => jazz ++ classic ++ reallyClassic ++ debatable
    }
  }
}
