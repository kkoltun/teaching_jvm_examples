package com.example.compiler;

public class Summing {

  public static void main(String[] args) {
    Summing summing = new Summing();
    int sum = summing.add(10, 11, 12);

    System.out.println(sum);
  }

  private int a(int x, int y) {
    return x + y;
  }

  public int add(int x, int y, int z) {
    return a(a(x, y), z);
  }
}
