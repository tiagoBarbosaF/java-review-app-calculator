package com.tiago.calculator.domain;

import com.tiago.calculator.domain.interfaces.Functions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Divide implements Functions {
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        try {
            return num1.divide(num2, RoundingMode.HALF_UP);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return BigDecimal.ZERO;
    }
}
