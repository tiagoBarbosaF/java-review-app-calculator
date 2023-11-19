package com.tiago.calculator.domain;

import com.tiago.calculator.domain.interfaces.Functions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Percentage implements Functions {
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        return num2.multiply(num1).divide(new BigDecimal(100), RoundingMode.HALF_UP);
    }
}
