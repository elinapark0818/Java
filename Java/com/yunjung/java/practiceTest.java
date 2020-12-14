package com.yunjung.java;

public class practiceTest {
    public static void main(String[ ] args) {
        int myAge = 40;
        int teacherAge = 38;

        boolean value = (myAge > 25);
        System.out.println(value);

        System.out.println(myAge <= 25);
        System.out.println(myAge == teacherAge);

        char ch;
        ch = (myAge > teacherAge) ? 'T': 'F';
        System.out.println(ch);

        System.out.println("----------------");

//        int num;
//        num = -5 + 3 * 10 / 2;
//        System.out.println(num);

//        int num = 10;
//        System.out.println(num);
//        System.out.println(num++);
//        System.out.println(num);
//        System.out.println(--num);

/*        int num1 = 10;
        int num2 = 20;
        boolean result;
       result = ((num1 > 10) && (num2 > 10));
        System.out.println(result);
        result = ((num1 > 10) || (num2 > 10));
        System.out.println(result);
        System.out.println(!result);
*/
/*        int num1 = 2;
        int num2 = 10;

        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);
*/
/*
        int num = 8;
        System.out.println(num += 10);
        System.out.println(num -= 10);
        System.out.println(num >>= 10);
*/
/*
        int num = 10;
        int num2 = 20;

        int result = (num >= 10) ? num2 + 10 : num2 - 10;
        System.out.println(result);
*/
/*
        int age = 6;
        if (age >= 8) {
            System.out.println("학교에 다닙니다");
        }
        else {
            System.out.println("학교에 다니지 않습니다");
        }
*/

/*        int age = 9;
        if (age >= 8) {
            System.out.println("학교에 다닙니다.");
        }
        else {
            System.out.println("학교에 다니지 않습니다.");
        }
*/
/*
        char gender = 'F';
        if (gender == 'F') {
            System.out.println("여성입니다.");
        }
        else {
            System.out.println("남성입니다.");
        }


 */
 /*
        int age = 29;
        int charge;
        if (age < 8) {
            charge = 1000;
            System.out.println("취학 전 아동입니다.");
        }
        else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다.");
        }
        else if (age < 20) {
            charge = 2500;
            System.out.println("중고등학생입니다.");
        }
        else {
            charge = 4000;
            System.out.println("일반인입니다.");
        }
        System.out.println("입장료는 " + charge + " 원입니다.");

*/
/*
        int ranking = 1;
        char medalColor;
        switch (ranking) {
            case 1 : medalColor = 'G';
                break;
            case 2 : medalColor = 'S';
                break;
            case 3 : medalColor = 'B';
                break;
            default:
                medalColor = 'A';
        }
        System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
*/
/*
        String medal = "Bronze";
        switch (medal) {
            case "Gold":
                System.out.println("금메달입니다.");
                break;
            case "Silver":
                System.out.println("은메달입니다.");
                break;
            case "Bronze":
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.println("메달이 없습니다.");
                break;
        }
*/
/*
        int floor = 1;
        String place = "";
        switch (floor) {
            case 1 : place = "약국";
                break;
            case 2 : place = "정형외과";
                break;
            case 3 : place = "피부과";
                break;
            case 4 : place = "치과";
                break;
            case 5 : place = "헬스클럽";
                break;
            default:
                System.out.println();
        }
        System.out.println(floor + "층은 " + place + " 입니다.");
*/
//        int num = 1;
//        num += 2;
//        num += 3;
//        num += 4;
//        num += 5;
//        num += 6;
//        num += 7;
//        num += 8;
//        num += 9;
//        num += 10;
//
//        System.out.println("1부터 10까지의 합은 " + num + " 입니다.");


//        // 1~10 합 구하기
//        int num = 1;
//        int sum = 0;
//
//        while (num <=10) {
//            sum += num;
//            num++;
//        }
//        System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");

//        //1~50 합 구하기
//        int num = 1;
//        int sum = 0;
//
//        while (num <= 50) {
//            sum += num;
//            num++;
//        }
//        System.out.println("1부터 50까지의 합은 " + sum + " 입니다.");


//        // do while 이용해서 1~10 합 구하기
//        int num = 1;
//        int sum = 0;
//
//        do {
//            sum += num;
//            num++;
//        } while (num <= 10);
//
//        System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");

//        //안녕하세요 10번하기
//        int i;
//        int sum;
//        for (i = 1, sum = 0; i <=10; i++) {
//            sum += i;
//        }
//        System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
//
//
//        for(int i = 1; i <= 10; i++) {
//            System.out.println(i + "안녕하세요");
//        }
//
        // 구구단
//        int dan;
//        int times;
//
//        for (dan = 2; dan <= 9; dan++) {
//            for (times = 1; times <=9; times++) {
//                System.out.println(dan + "X" + times + "=" + dan * times);
//            }
//            System.out.println();
//        }

//        // 1~100 까지의 홀수의 합 구하기
//        int total = 0;
//        int num;
//
//        for (num = 1; num <= 100; num++) {
//            if (num % 2 == 0)
//                continue;
//            total += num;
//        }
//        System.out.println("1부터 100까지의 홀수의 합은 : " + total + " 입니다.");

//        // 1~100 중 3의 배수 출력하기
//        int num;
//
//        for (num =1; num <= 100; num++) {
//            if (num % 3 != 0)
//                continue;
//            System.out.println(num);
//        }

//        int sum = 0;
//        int num = 0;
//
//        for (num = 0; sum < 100; num++) {
//            sum += num;
//        }
//        System.out.println("num : " + num);
//        System.out.println("sum : " + sum);

//        // breake 예제
//         int sum = 0;
//         int num = 0;
//
//         for (num = 0; ; num++) {
//             sum += num;
//             if (sum >= 100)
//                 break;
//         }
//        System.out.println("num : " + num);
//        System.out.println("sum : " + sum);


//        int sum = 0;
//        int num;
//        for (num = 1; ; num++) {
//            sum += num;
//            if (sum >= 500)
//                break;
//            }
//        System.out.println(sum);
//        System.out.println(num);

        // 1 operator 값이 +,-,*,/ 인 경우에 사칙 연산을 수행하는 프로그램을 if-else if문과 switch case문을 사용해 작성해 보시오.


        int num1 = 10;
        int num2 = 2;
        int result = 0;
        char operator = '+';

        switch (operator) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            default:
                System.out.println("연산자를 잘못 입력하였습니다.");
        }
        System.out.println(num1 + "operator" + num2 + "=" + result);



        //2 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요. continue 를 사용해보자



        //3 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요. break 를 사용해보자




        //4 반복문을 사용하여 *트리를 출력하는 프로그램을 만들어보자.



        //5 반복문과 조건문을 사용하여 *마름모를 출력하는 프로그램을 만들어보자.









    }
}
