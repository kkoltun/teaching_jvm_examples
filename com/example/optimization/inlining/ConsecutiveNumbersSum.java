package com.example.optimization.inlining;

public class ConsecutiveNumbersSum {
  private long totalSum;
  private int totalNumbers;

  public ConsecutiveNumbersSum(int totalNumbers) {
    this.totalNumbers = totalNumbers;
  }

  public long getTotalSum() {
    totalSum = 0;
    for (int i = 0; i < totalNumbers; i++) {
      totalSum += i;
    }
    return totalSum;
  }
}
