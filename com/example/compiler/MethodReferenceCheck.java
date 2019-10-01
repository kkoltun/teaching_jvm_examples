package com.example.compiler;

import java.util.function.Function;

public class MethodReferenceCheck {
  public static void main(String[] args) {
    String message = "Hello World!";
    logWithModification(message, String::toUpperCase);
  }

  private static void logWithModification(String msg, Function<String, String> modification) {
    System.out.println(modification.apply(msg));
  }
}
