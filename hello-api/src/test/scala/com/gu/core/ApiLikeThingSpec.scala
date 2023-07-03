package com.gu.core


import org.scalatest.funsuite.AnyFunSuite


class ApiLikeThingSpec extends AnyFunSuite {

  val drummerDummyApi = new ApiLikeThing("www.shebangsthedrum.com", "onlyJ)k1ng")

  test("Ringo is a debatable Drummer") {
    assert(!drummerDummyApi.getDrummerList("rock").contains(
      "Ringo Starr"
    ))
    assert(drummerDummyApi.getDrummerList("ass").length == 9)
  }

  test( "The greatest is Art Blakey") {
    assert(drummerDummyApi.getDrummerList("Jazz").headOption == Some("Art Blakey"))
    assert(drummerDummyApi.getDrummerList("all").headOption == Some("Art Blakey"))
  }

  test("Mitch Mitchell Is the greatest ever rock drummer") {
    assert(drummerDummyApi.getDrummerList("rocK").headOption == Some("Mitch Mitchel"))
  }

}
