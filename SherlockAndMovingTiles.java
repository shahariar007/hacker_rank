package com.mortuza.math;

import java.util.ArrayList;
import java.util.List;

public class SherlockAndMovingTiles {
    private static final String TAG = "SherlockAndMovingTiles";

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(100);
//        list.add(47115376367013);
//        list.add(23539529357307);
//        list.add(8916782916802);
//        list.add(59961358140081);
//        list.add(9053898415172);
//        list.add(13016078377939);
//        list.add(45424847912645);
//        list.add(35721566249105);
//        list.add(42183413115088);
//        list.add(49062285906747);
//        list.add(24827171274023);

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
