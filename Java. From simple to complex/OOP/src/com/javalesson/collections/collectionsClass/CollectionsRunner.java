package com.javalesson.collections.collectionsClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsRunner {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("yellow");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("red");

        System.out.println("List before sorting " + colors);
        Collections.sort(colors);
        System.out.println("List after sorting " + colors);
    }
}
