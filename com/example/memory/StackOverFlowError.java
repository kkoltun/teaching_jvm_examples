package com.example.memory;

public class StackOverFlowError {
  public static void main(String[] args) {
    System.out.println(addNumbersRecursively(100000));
  }

  private static int addNumbersRecursively(int n) {
    return addNumbers(0, 0, n);
  }

  private static int addNumbers(int currentSum, int currentStep, int n) {
    if (currentStep < n) {
      currentSum = addNumbers(currentSum, currentStep + 1, n);
    }
    return currentSum + currentStep;
  }
}
