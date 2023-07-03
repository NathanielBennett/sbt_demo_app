package com.gu.hello

import org.scalatest.funsuite.AnyFunSuite

class HelloSpec extends AnyFunSuite{
  test("Hello should start with H") {
    assert(Hello.getHello().startsWith("H"))
  }

  test("Hello with no greet should add !") {
    assert(Hello.getHello() == "Hello!")
  }

  test("Hello with greet should say so" ) {
    assert(Hello.getHello(Some("Sunshine")) == "Hello, Sunshine!")
  }

  test("Art Blakey is the greatest") {
    assert(Hello.hailToTheDrummer(Some("all")) == "the greatest is: Art Blakey")
  }
}

