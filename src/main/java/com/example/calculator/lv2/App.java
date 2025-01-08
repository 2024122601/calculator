package com.example.calculator.lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator2 cal = new Calculator2();
        Scanner sc = new Scanner(System.in);

        double result;
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            double num1 = sc.nextDouble();
            System.out.print("두 번째 숫자를 입력하세요:");
            double num2 = sc.nextDouble();
            System.out.print("연산자를 입력하세요 (+, -, *, /):");
            char operator = sc.next().charAt(0);
            result = cal.calculator(num1, num2, operator);
            System.out.println("결과 : "+result);
            cal.saveResult(result);


            System.out.println("종료하시겠습니까? 종료하시려면 exit를 눌러주세요");
            String sc2 = sc.next();
            if(sc2.equals("exit")) {
                break;

            }
            System.out.println("첫번째 결과를 삭제하시겠습니까?? 삭제하시려면 Y를 눌러주세요");
            String sc3 = sc.next();
            if(sc3.equals("Y")) {
                cal.removeResult();

            }
        }

        System.out.println("계산된 결과들 : ");
        cal.printResult();
        System.out.println("계산기를 종료합니다.");
    }
}
