package com.yunjung.java;

public class Practice {
    public static void main(String[ ]args) {
        // 0b10000000 은 이진수로 1000 0000 을 의미합니다.
        // & 연산을 통해서 첫번째 비트만 가져오는 것입니다.
        // 0b가 붙으면 2진수 / 안붙으면 8진수가 된다
        /**
         * - 정수 리터럴 -
         * 10진수, 8진수, 16진수, 2진수 리터럴
         * int a = 15;
         * int b = 015;
         * int c = 0x15;
         * int d = 0b0101;
         */
        int num = 0B00000101;
        System.out.println(num);
        System.out.println(num << 2);
        System.out.println(num >> 2);
        System.out.println(num >>> 2);

        num = num << 2;
        System.out.println(num);

        System.out.println("---------------------");
        int a = 7;
        System.out.println(a);
        System.out.println(a >> 2);
        System.out.println(a >>> 2);
        System.out.println("---------------------");
        int b = -7;
        System.out.println(b);
        System.out.println(b >> 2);
        System.out.println(b >>> 2);

        String s = Integer.toBinaryString(1);
        System.out.println(s);

//        111
//                111 // 8의 2승 더하기 8의 1승 더하기 8의 0승
//                        111 19ABCDEF
//            1111 1110 1100
//                    F

    }
}
//111 1111 1111 1111 1111 1111 1111 1111
//
//0000 0000 0000 0000 0000 0000 0000 0111
//1111 1111 1111 1111 1111 1111 1111 1000
