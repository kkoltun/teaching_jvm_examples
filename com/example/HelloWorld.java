package com.example;

public class HelloWorld {
  private static final String MESSAGE = "HELLO WORLD";

  public static void main(String[] args) {
    String message = "Hello, ";
    System.out.println("JESTEM TUTAJ");
    if (args.length == 0) {
      message += "Unknown";
    } else {
      for (String arg : args) {
        message += arg;
        message += " ";
      }
    }
    System.out.println(message);
  }
}
