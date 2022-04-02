package com.example

import org.scalatest.funsuite.AnyFunSuite

class GreetingTest extends AnyFunSuite {

  test("生成") {
    val msg = Greeting.createMessage("John")
    assert(msg == "Hello, John!")
  }

  test("error") {
    assertThrows[IllegalArgumentException] {
      Greeting.createMessage("")
    }
  }
}
