package com.tiago.calculator.domain;

import com.tiago.calculator.domain.interfaces.Functions;

import java.math.BigDecimal;

public class Multiply implements Functions {
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }
}
