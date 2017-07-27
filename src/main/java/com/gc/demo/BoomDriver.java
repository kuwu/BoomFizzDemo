package com.gc.demo;

import java.util.Scanner;

public class BoomDriver {

  public static void main(String[] args) {

    BoomFiz boom = new BoomFiz();
    String val = "";
    for (int i = 0; i < 20; i++) {
      val = boom.boom( i );
      System.out.println( val );
    }
  }
}