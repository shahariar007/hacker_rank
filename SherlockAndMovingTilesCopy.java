package com.mortuza.math;

import java.util.ArrayList;
import java.util.List;

public class SherlockAndMovingTilesCopy {
    private static final String TAG = "SherlockAndMovingTiles";

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(100);

        System.out.println(connections(10, 1, 2, list));
    }

    public static List<Double> connections(int l, int s1, int s2, List<Integer> queries) {
        List<Double> doubles = new ArrayList<>();
        double s1s2 = Math.abs(s2 - s1);
        for (int i = 0; i < queries.size(); i++) {
            Double d = ((((Math.sqrt(2)) * l) - (Math.sqrt((long)queries.get(i))) * Math.sqrt(2)) / s1s2);
            doubles.add(d);
        }

        return doubles;
    }
}
