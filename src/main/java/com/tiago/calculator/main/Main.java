package com.tiago.calculator.main;

import com.tiago.calculator.domain.*;
import com.tiago.calculator.domain.interfaces.Functions;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private static Functions functions;

    public void calculator() {
        String menuBorder = String.valueOf('*').repeat(20);
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        values values;

        while (exit) {
            menu(menuBorder);

            System.out.print("\nEnter the function: ");
            String option = scanner.next();

            switch (option) {
                case "1":
                    values = getValues(scanner);
                    System.out.println(sum(values.num1(), values.num2()));
                    break;
                case "2":
                    values = getValues(scanner);
                    System.out.println(subtract(values.num1(), values.num2()));
                    break;
                case "3":
                    values = getValues(scanner);
                    System.out.println(multiply(values.num1(), values.num2()));
                    break;
                case "4":
                    values = getValues(scanner);
                    System.out.println(divide(values.num1(), values.num2()));
                    break;
                case "5":
                    values = getValues(scanner);
                    System.out.println(percentage(values.num2(), values.num1()));
                    break;
                case "0":
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid option, choose the right option.");
                    break;
            }
        }
    }

    private static void menu(String menuBorder) {
        System.out.println();
        System.out.println(menuBorder);
        System.out.println("== Calculator ==");
        System.out.println(" 1 - Sum");
        System.out.println(" 2 - Subtract");
        System.out.println(" 3 - Multiply");
        System.out.println(" 4 - Divide");
        System.out.println(" 5 - Percentage");
        System.out.println(" 0 - Exit");
        System.out.println(menuBorder);
    }


    private static BigDecimal sum(BigDecimal num1, BigDecimal num2) {
        functions = new Sum();
        return functions.calculate(num1, num2);
    }

    private static BigDecimal subtract(BigDecimal num1, BigDecimal num2) {
        functions = new Subtract();
        return functions.calculate(num1, num2);
    }

    private static BigDecimal multiply(BigDecimal num1, BigDecimal num2) {
        Functions multiply = new Multiply();
        return multiply.calculate(num1, num2);
    }

    private static BigDecimal divide(BigDecimal num1, BigDecimal num2) {
        functions = new Divide();
        return functions.calculate(num1, num2);
    }

    private static BigDecimal percentage(BigDecimal percent, BigDecimal value) {
        functions = new Percentage();
        return functions.calculate(value, percent);
    }

    private static values getValues(Scanner scanner) {
        System.out.print("\nEnter the first value: ");
        BigDecimal num1 = scanner.nextBigDecimal();
        System.out.print("Enter the second value: ");
        BigDecimal num2 = scanner.nextBigDecimal();
        return new values(num1, num2);
    }

    private record values(BigDecimal num1, BigDecimal num2) {
    }
}
