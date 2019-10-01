package com.example.classloader;

import java.awt.*;
import java.util.ArrayList;

public class ClassloaderCheck {

  public static void main(String[] args) throws ClassNotFoundException{
    printClassLoaders();
  }

  private static void printClassLoaders() throws ClassNotFoundException {
    System.out.println("Class of a class: " + ClassloaderCheck.class);
    System.out.println("Classloader of this class: "
        + ClassloaderCheck.class.getClassLoader());

    System.out.println("Classloader of SQL Statement: "
        + javax.sql.RowSet.class.getClassLoader());

    System.out.println("Classloader of PlatformClassLoader: "
        + ClassLoader.getPlatformClassLoader().getClass().getClassLoader());

    System.out.println("Classloader of ArrayList: "
        + ArrayList.class.getClassLoader());

    ClassLoader.getPlatformClassLoader().loadClass("A");
  }

}
