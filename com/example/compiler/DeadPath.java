package com.example.compiler;

public class DeadPath {
  public static void main(String[] args) {
    boolean flag = false;

    if (flag) {
      System.out.println("Flag is true");
    } else {
      System.out.println("Flag is true");
    }
  }
}
