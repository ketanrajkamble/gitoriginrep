package org.learngit;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloAppTest {
 @Test
  public void testSayHello(){
  HelloApp hello=new HelloApp();
  assertEquals( "Hello World !",hello.sayHello());
  }
}

