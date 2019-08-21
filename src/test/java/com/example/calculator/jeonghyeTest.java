package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class jeonghyeTest {
    @Test
    public void test_곱셈(){
        Calculator calc = new Calculator();
        int result = calc.mul(50, 2);
        assertEquals(100, result);
    }

}