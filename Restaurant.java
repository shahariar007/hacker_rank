package com.mortuza.math;

public class Restaurant {
    private static final String TAG = "Restaurant";

    public static void main(String[] args) {
        int x=2;
        int y= 2;
        int xy=x*y;
        System.out.println(xy/ (int)Math.pow(calGCD(x,y),2));
    }

    static int calGCD(int num1, int num2) {
        if (num2 == 0) return num1;
        return calGCD(num2, num1 % num2);
    }
}
