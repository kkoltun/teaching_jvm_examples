package com.example.logger;

public class LoggerUser {
  public static void main(String[] args) {
    SimpleLogger simpleLogger = new SimpleLogger("myApp", "", true);
    simpleLogger.log("Hello, World");
    simpleLogger.log("Hi, Karol");
    simpleLogger.log("Hello, Java Group");
    simpleLogger.log("Hi, Anna");
  }
}
