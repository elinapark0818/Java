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
    }
}
