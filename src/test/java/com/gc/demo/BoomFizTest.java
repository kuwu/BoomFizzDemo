package com.gc.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoomFizTest {
  @Test
  public void boomTest1() throws Exception {
    BoomFiz bf = new BoomFiz();
    String expected = "1";
    String actual = bf.boom(1);
    //assertion
    assertEquals( "Your code sucks!", expected, actual);

  }

  @Test
  public void boomTest7() throws Exception{
    BoomFiz bf = new BoomFiz();
    String expected = "boom";
    String actual = bf.boom(7);
    //assertion
    assertEquals( "Your code sucks!", expected, actual);




  }

}