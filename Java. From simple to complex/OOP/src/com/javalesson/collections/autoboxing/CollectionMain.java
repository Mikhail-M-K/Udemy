package com.javalesson.collections.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        //list.add(Integer.valueOf(1));

        /*Integer integ = 56;
        int n = integ.intValue(integ);
        Double doub = 56.567;
        double d = doub.doubleValue(doub);*/



        String[] colors = {"yellow", "green", "blue"};
        LinkedList<String> ll = new LinkedList<>(Arrays.asList(colors));
        ll.add("black");

        colors = ll.toArray(new String[ll.size()]);

        for (String col:colors) {
            System.out.println(col);
        }
    }
}
