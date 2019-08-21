package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JiwoongTest222222 {
    @Test
    public void test_곱셈(){
        Calculator calc = new Calculator();
        int result = calc.mul(500, 2);
        assertEquals(1000, result);
    }

}