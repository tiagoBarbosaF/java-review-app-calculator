package com.tiago.calculator.domain.interfaces;

import com.tiago.calculator.domain.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class FunctionsTest {
    private Functions functions;

    @Test
    @DisplayName("Test - sum calculate")
    public void testSum() {
        functions = new Sum();

        BigDecimal sum = functions.calculate(new BigDecimal(5), new BigDecimal(3));

        Assertions.assertEquals(new BigDecimal(8), sum);
    }

    @Test
    @DisplayName("Test - subtract calculate")
    public void testSubtract() {
        functions = new Subtract();

        BigDecimal subtract = functions.calculate(new BigDecimal("25.5"), new BigDecimal("13.5"));

        Assertions.assertEquals(new BigDecimal("12.0"), subtract);
    }

    @Test
    @DisplayName("Test - multiply calculate")
    public void testMultiply() {
        functions = new Multiply();

        BigDecimal multiply = functions.calculate(new BigDecimal("12.45"), new BigDecimal("3.67"));

        Assertions.assertEquals(new BigDecimal("45.6915"), multiply);
    }

    @Test
    @DisplayName("Test - divide calculate")
    public void testDivide() {
        functions = new Divide();

        BigDecimal divide = functions.calculate(new BigDecimal("20.0"), new BigDecimal("4.0"));

        Assertions.assertEquals(new BigDecimal("5.0"), divide);
    }

    @Test
    @DisplayName("Test - percentage calculate")
    public void testPercentage(){
        functions = new Percentage();

        BigDecimal percentage = functions.calculate(new BigDecimal("60.0"), new BigDecimal("20.0"));

        Assertions.assertEquals(new BigDecimal("12.00"),percentage);
    }
}