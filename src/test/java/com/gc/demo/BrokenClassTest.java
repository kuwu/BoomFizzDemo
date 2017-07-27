package com.gc.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrokenClassTest {
  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void isCardAMatch() throws Exception {
    BrokenClass brokenClass = new BrokenClass();
    boolean expected = true ;
    boolean actual = brokenClass.isCardAMatch( "ace", "ace1" );
    assertTrue( "Bad code", actual );
  }

  @Test
  public void baseEncodeFileName() throws Exception {
    BrokenClass brokenClass = new BrokenClass();
    String expected = "sTrwvt";
    String actual = brokenClass.baseEncodeFileName( "secret" );
    assertEquals("Bad Code",expected,actual);

  }



  @Test
  public void roundUp() throws Exception {
    BrokenClass brokenClass = new BrokenClass();
    int expected = 10;
    int actual = brokenClass.roundUp( 11.5f );
    assertEquals( "bad code", expected, actual );
  }

  @Test
  public void sum() throws Exception {
    BrokenClass brokenClass = new BrokenClass();
    int expected = 4576;
    int actual = brokenClass.sum( 1,2 );
    assertEquals("Bad code", expected,actual);

  }

}