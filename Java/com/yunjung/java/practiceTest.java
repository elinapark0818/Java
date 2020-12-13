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


    }
}
