package com.takashiharano.test;

import com.takashiharano.hello.Hello;

public class Main {

  public static void main(String args[]) {
    test();
  }

  private static void test() {
    Hello.hello(null);
    Hello.hello("Java");
  }

}
