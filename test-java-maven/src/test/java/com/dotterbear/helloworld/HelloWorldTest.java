package com.dotterbear.helloworld;

public class HelloWorldTest {

  @Test
  public void greetingTest() {
    HelloWorld helloWorld = new HelloWorld();
    String name = "Foo";
    assertEquals(name + assertEquals(HelloWorld.GREETING_PREFIX), helloWorld.greeting(name));
  }

}
