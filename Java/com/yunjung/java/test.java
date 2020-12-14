package com.yunjung.java;

public class test {
    public static void main(String[ ]args) {

        // 1. operator 값이 +,-,*,/ 인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과 switch case문을 사용해 작성해 보시오.

        int num1 = 5;
        int num2 = 4;
        int result = 0;
        String operator = "*";

        if ("+".equals(operator)) {
            result = num1 + num2;
        } else if ("-".equals(operator)) {
            result = num1 - num2;
        } else if ("*".equals(operator)) {
            result = num1 * num2;
        } else if ("/".equals(operator)) {
            result = num1 / num2;
        } else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }
        System.out.println(num1 + operator + num2 + "=" + result + "입니다.");

        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

        // 2. 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요.
        for (int i = 2; i < 10; i += 2) {   // 2를 더해줌으로써 짝수단 완성
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "X" + j + "=" + (i * j));
            }
            System.out.println();
        }

        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

        for (int i = 2; i < 10; i++) {  // 1을 더해줌으로써 그냥 구구단
            if((i % 2) != 0) {  // 짝수가 아니게 if 문을 사용했다
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + "X" + j + "=" + (i * j));
                }
            System.out.println();
            }
        }
        // 2-1 구구단을 짝수단만 출력하도록 continue 를 사용한 프로그램을 만들어보세요.

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i % 2 != 0) // 홀수일 경우 그냥 넘어가게 컨티뉴
                    continue;
                System.out.println(i + "X" + j + "=" + (i * j));
            }
        System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

        // 3. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요.
        int dan;
        int times;

        for (dan = 2; dan <= 9; dan++) {
            for (times = 1; times <= dan; times++) {
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }

        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

        // 4. 반복문을 사용하여 *트리를 출력하는 프로그램을 만들어보자.

        int c = 1;
        int d = 0;
        for (int j = 1; j < 8; j++) {
            for (int m = 10; m > c; m--) {
                System.out.printf(" ");
            }
            for (int i = 0; i <= d; i++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
            if (j < 10) {
                c++;
                d += 2;
            } else {
                c --;
                d -= 2;
            }
        }

        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("--------------------");

        // 5. 반복문과 조건문을 사용하여 *마름모를 출력하는 프로그램을 만들어보자.

        int a = 1;
        int b = 0;
        for (int j = 1; j < 10; j++) {
            for (int m = 5; m > a; m--) {
                System.out.printf(" ");
            }
            for (int i = 0; i <= b; i++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
            if (j < 5) {
                a++;
                b += 2;
            } else {
                a --;
                b -= 2;
            }
        }




    }
}
