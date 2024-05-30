package com.tsola2002.calculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculatorTest {

  private int input1;
  private int input2;
  private int expectedResult;

  public CalculatorTest(int input1, int input2, int expectedResult) {
    this.input1 = input1;
    this.input2 = input2;
    this.expectedResult = expectedResult;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
        { 1, 1, 2 },
        { 2, 3, 5 },
        { 3, 7, 10 },
        { 4, 5, 9 },
        { 5, 5, 10 }
    });
  }

  @Test
  public void testAddition() {
    Calculator calc = new Calculator();
    assertEquals(expectedResult, calc.add(input1, input2));
  }

  @Test
  public void add() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(7, calculator.add(3,4));
  }


}