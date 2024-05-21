package com.tsola2002.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void add() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(7, calculator.add(3,4));
  }
}