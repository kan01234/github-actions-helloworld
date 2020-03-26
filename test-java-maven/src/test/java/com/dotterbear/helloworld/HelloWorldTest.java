package com.dotterbear.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

  @Test
  public void greetingTest() {
    HelloWorld helloWorld = new HelloWorld();
    final String name = "Foo";
    assertEquals(HelloWorld.GREETING_PREFIX, helloWorld.greeting(name));
  }

}
