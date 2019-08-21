package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JiwoongTest {
    @Test
    public void test_곱셈(){
        Calculator calc = new Calculator();
        int result = calc.mul(50, 2);
        assertEquals(100, result);
    }

}