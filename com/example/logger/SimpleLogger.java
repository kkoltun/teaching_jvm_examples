package com.example.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Extensions:
* use StringBuilder
* use String.format()
* examine better ways to build String
* build pattern for every log
* introduce log levels
* log to file, console...

Knowledge:
* about Strings
* about GarbageCollector?
* about timings
 */
public class SimpleLogger {
  private String prefix = "";
  private String suffix = "";
  private boolean logTime;

  public SimpleLogger() {
  }

  public SimpleLogger(String prefix, String suffix, boolean logTime) {
    this.prefix = prefix;
    this.suffix = suffix;
    this.logTime = logTime;
  }

  public void log(String message) {
    String messageToLog = "";

    if (this.isLogTime()) {
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
      LocalDateTime now = LocalDateTime.now();

      messageToLog += dateTimeFormatter.format(now);
      messageToLog += " ";
    }

    messageToLog += "[";
    messageToLog += this.getPrefix();
    messageToLog += "]: ";

    messageToLog += message;
    messageToLog += " ";

    messageToLog += this.getSuffix();

    System.out.println(messageToLog);
  }

  public String getPrefix() {
    return prefix;
  }

  public String getSuffix() {
    return suffix;
  }

  public boolean isLogTime() {
    return logTime;
  }
}