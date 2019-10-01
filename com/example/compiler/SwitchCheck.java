package com.example.compiler;

public class SwitchCheck {
  public static void main(String[] args) {
    String[] numbers = {"one", "two", "three"};

    translate(numbers);
    for (String number : numbers) {
      System.out.println(number);
    }
  }

  private static void translate(String[] numbers) {
    for (int i = 0; i < numbers.length; ++i) {
      switch (numbers[i]) {
        case "one":
          numbers[i] = "jeden";
          break;
        case "two":
          numbers[i] = "dwa";
          break;
        case "three":
          numbers[i] = "trzy";
          break;
        default:
          numbers[i] = "nieznana";
          break;
      }
    }
  }
}
