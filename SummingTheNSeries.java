package com.mortuza.math;

public class SummingTheNSeries {
    private static final String TAG = "SummingTheNSeries";

    public static void main(String[] args) {
        System.out.println(connections((long) Math.pow(10,16)));
    }

    public static int connections(long n) {
        int mod= (int)((Math.pow(10,9))+ 7);
        long route = 0L;
        route = (n%mod) * (n % mod) % mod;
        return (int)route;
    }
}
