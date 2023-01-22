package com.mortuza.math;

import java.util.ArrayList;
import java.util.List;

public class ConnectingTowns {
    private static final String TAG = "ConnectingTowns";

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(connections(4,list));
    }

    public static int connections(int n, List<Integer> list) {
        int route = 1;
        for (int i = 0; i < (n - 1); i++) {
            route = (route * list.get(i)) % 1234567;
        }
        return route;
    }
}
