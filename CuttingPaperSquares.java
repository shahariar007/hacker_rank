package com.mortuza.math;

import java.util.ArrayList;
import java.util.List;

public class CuttingPaperSquares {
    private static final String TAG = "ConnectingTowns";

    public static void main(String[] args) {

        System.out.println(connections(3,2));
    }

    public static long connections(int n, int m) {
        long route=((long)n*(long)m)-1;
        return route;
    }
}
