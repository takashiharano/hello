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
    String target = null;
    if (args.length > 0) {
      target = args[0];
    }
    hello(target);
  }

  /**
   * Say Hello world.
   */
  public static void hello() {
    hello("world");
  }

  /**
   * Say Hello.
   *
   * @param target
   *          target
   */
  public static void hello(String target) {
    System.out.println("Hello, " + target + "!");
  }

}
