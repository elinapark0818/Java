package com.yunjung.java;

public class Infinite {
    static int i = 0;
    public static void main(String[] args) {
        go();
    }

    private static void go() {
        if (i == 1000){
            System.out.println();
        }
        i++;
        go();
    }
}
