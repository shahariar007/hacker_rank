package com.mortuza.math;

import java.util.ArrayList;
import java.util.List;

public class BestDivisor {
    private static final String TAG = "BestDivisor";

    public static void main(String[] args) {

        int desireNumber = 239;
        int topSum=0;
        int bestDivisor=0; // best
        for (int i = 1; i <= desireNumber; i++) {
            if (desireNumber % i == 0)  // desire Divisor
            {
                int n=i;
                int sum=0;    // initial divisor sum
                while (n > 0) {       // for 12= 1+2 calculation
                   sum+= (n % 10);
                   n = (int) n / 10;
                }
                if(topSum<sum) // best divisor compare
                {
                    topSum = sum;
                    bestDivisor=i;
                }
            }
        }
        System.out.println(bestDivisor);
    }
}
