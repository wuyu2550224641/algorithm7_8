package com.example.algorithm7_8;


public class Myfaction {
    public static int getResult1() {
        int sum=0;
        return sum;
    }

    public static double getResult2(Integer n) {
        int sumNum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                sumNum += i;
            }
        }
        return Math.sqrt(sumNum);
    }

    public static int getResult3(int a) {
        double S =0;
        double f=0;
        for (int n = 0; n <= a; n++) {
            f=f*10+a;
            S+=f;
        }
        return (int) S;
    }
    public static int getResult4(int a, int b) {
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        String sumNum = "";
        sumNum += String.valueOf(b1.charAt(1));
        sumNum += String.valueOf(b1.charAt(0));
        sumNum += String.valueOf(a1.charAt(1));
        sumNum += String.valueOf(a1.charAt(0));
        return Integer.valueOf(sumNum);
    }

    public static int getResult5(int N) {
        int tao = 1;
        for (int i = 0; i < N - 1; i++) {

            tao = (tao + 1) * 2;
        }
        return tao;
    }

    public static int getResult6(int a) {
        int b = 0;
        while (a > 0) {
            b *= 10;
            b += a % 10;
            a /= 10;
        }
        return b;
    }
}
