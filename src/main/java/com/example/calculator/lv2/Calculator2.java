package com.example.calculator.lv2;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator2 {
    private ArrayList<Double> doubleList = new ArrayList<>();
    public ArrayList<Double> getDoubleList() {
        return doubleList;
    }
    public void saveResult(double result) {
        doubleList.add(result);
    }
    public void removeResult() {
        doubleList.remove(0);
        System.out.println("첫번째 결과가 삭제되었습니다");
    }

    public double calculator(double num1, double num2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    result = Double.NaN;
                    break;

                }
                result = num1 / num2;
            default:
                System.out.println("잘못된 연산자입니다.");
                result = Double.NaN;
                break;
        }

        return result;

    }
    public void printResult() {
        for (double result : doubleList) {
            System.out.println(result);
        }
    }
}