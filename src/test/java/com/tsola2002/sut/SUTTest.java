package com.tsola2002.sut;

import static org.junit.Assert.*;

import com.tsola2002.calculator.Calculator;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class SUTTest {
  private static ResourceForAllTests resourceForAllTests;
  private SUT systemUnderTest;
  private int input1;
  private int input2;
  private int expectedResult;


  @BeforeClass
  public static void setUpClass() {
    resourceForAllTests = new ResourceForAllTests("Our resource for all tests");
  }

  @Before
  public void setUp() {
    systemUnderTest = new SUT("Our system under test");
  }

  @Test
  public void canReceiveRegularWork() {
  }

  @Ignore("This feature is not ready!!")
  @Test
  public void myThirdTest() {
    assertEquals("2 is not equal to 1", 2, 1);
  }


  @Test(timeout = 4000)
  public void testLongRunningMethod() throws InterruptedException {
    SUT mySut = new SUT("long running system");
    mySut.longRunningMethod();
  }

  @AfterClass
  public static void tearDownClass() {
    resourceForAllTests.close();
  }

}