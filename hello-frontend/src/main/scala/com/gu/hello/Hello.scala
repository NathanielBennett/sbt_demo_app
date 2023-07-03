package com.gu.hello


import com.gu.core.ApiLikeThing

object Hello {

  private val dummerApi = new ApiLikeThing("https://wwww.theyallbang.com", "st1x")

  def main(args: Array[String]): Unit = {
    println("Good evening, Sargeant-Major")
  }


  def getHello(helloAppend: Option[String] = None): String = {
    helloAppend.map(p => s"Hello, $p!").getOrElse(
      "Hello!"
    )
  }

  def hailToTheDrummer(hailGrenre: Option[String]): String = {

     val apiArg = hailGrenre.getOrElse("all")
     val drummers = dummerApi.getDrummerList(apiArg)

     s"the greatest is: ${drummers.headOption.getOrElse("Jack DeJohnette")}"
  }




}
