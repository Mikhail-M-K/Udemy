package com.javalesson.collections.arrays;

import java.security.SecureRandom;

public class Dies {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequency = new int[7];
        for (int i = 0; i < 1000; i ++) {
            ++frequency[1 + random.nextInt(6)];
        }

        for(int i = 1; i < frequency.length; i++) {
            System.out.println("Side " + i + " : " + frequency[i]);
        }
        multidimArrayLauncher();
    }


    private static void multidimArrayLauncher(){
        int[][] a = {{1,2},
                     {3,4,5,6},
                     {7,8,9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
