package com.example.compiler;

public class InvokeStatic {
  static {
    System.out.println("Static block!");
  }

  public InvokeStatic() {
    System.out.println("Constructor!");
  }

  public void hello() {
    System.out.println("Hello world!");
  }

  public static void main(String[] args) {
    InvokeStatic invokeStatic = new InvokeStatic();
    invokeStatic.hello();
  }
}
