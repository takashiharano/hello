package com.takashiharano.test;

import com.takashiharano.hello.Hello;

public class Main {

  public static void main(String args[]) {
    test();
  }

  private static void test() {
    String[] arg = new String[0];
    Hello.main(arg);

    String[] arg1 = { "Java" };
    Hello.main(arg1);

    Hello.hello();
    Hello.hello("Java");
    Hello.hello(null);
  }

}
