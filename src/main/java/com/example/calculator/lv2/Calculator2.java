package com.example.calculator.lv2;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> doubleList = new ArrayList<Double>();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            double num1 = sc.nextDouble();
            System.out.print("두 번째 숫자를 입력하세요:");
            double num2 = sc.nextDouble();
            System.out.print("연산자를 입력하세요 (+, -, *, /):");
            char operator = sc.next().charAt(0);
            double result = 0;

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
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");

                    }
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");

            }
            System.out.println("결과: " + result);
            doubleList.add(result);

            System.out.print("더 계산하시겠습니까?:");
            String sc2 = sc.next();
            if(sc2.equals("exit")) {


                break;
            }

        }
        System.out.println(doubleList.toString());

    }
}