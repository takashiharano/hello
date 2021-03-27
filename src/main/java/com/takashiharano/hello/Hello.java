package com.takashiharano.hello;

/**
 * Hello, world!
 */
public class Hello {

  /**
   * Command line interface.
   *
   * @param args
   *          The command line parameters.
   */
  public static void main(String args[]) {
    if (args.length == 0) {
      hello();
    } else {
      hello(args[0]);
    }
  }

  /**
   * Say Hello world.
   */
  public static String hello() {
    return hello("world");
  }

  /**
   * Say Hello.
   *
   * @param target
   *          target to say hello
   */
  public static String hello(String target) {
    String str = "Hello, " + target + "!";
    System.out.println(str);
    return str;
  }

}
