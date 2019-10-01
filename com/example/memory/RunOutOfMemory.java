package com.example.memory;

import java.util.LinkedList;
import java.util.List;

public class RunOutOfMemory {
  public static void main(String[] args) throws InterruptedException {
    List<Object> fixedData = consumeAvailableMemory();
    System.out.println("Almost out of memory");
    while (true) {
      Object data = new byte[64 * 1024 - 1];
    }
  }

  private static List<Object> consumeAvailableMemory() throws InterruptedException {
    int i = 0;
    LinkedList<Object> holder = new LinkedList<>();
    while (true) {
      try {
        if (i % 100 == 0) {
          System.out.println(i);
        }
//        Thread.sleep(1);

        holder.add(new byte[128 * 1024]);
        ++i;
      } catch (OutOfMemoryError ex) {
        holder.removeLast();
        System.out.println("Out of memory");
        return holder;
      }
    }
  }
}