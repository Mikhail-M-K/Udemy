package com.company;

public class Main {

    public static void main(String[] args) {
        byte b1 = 0b1100, b2 = 014, b3 = 12, b4 = 0xC;
        System.out.println(b1 + ", " + b2 + ", " + b3 + ", " + b4);

        short s1 = 0b10100010100, s2 = 02424, s3 = 1300, s4 = 0x514;
        System.out.println(s1 + ", " + s2 + ", " + s3 + ", " + s4);

        int i1 = 0b0, i2 = 00, i3 = 0, i4 = 0x0;
        System.out.println(i1 + ", " + i2 + ", " + i3 + ", " + i4);

        long l1 = 0b111_010_110_111_100_110_100_010_101L, l2 = 0726746425L, l3 = 123456789L, l4 = 0x75BCD15L;
        System.out.println(l1 + ", " + l2 + ", " + l3 + ", " + l4);

        float f1 = 11.6F, f2 = 0.16518F;
        System.out.println(f1 + ", " + f2);

        double d1 = 3.145456487D, d2 = 155.02205587D;
        System.out.println(d1 + ", " + d2);

        boolean bool1 = true, bool2 = false;
        System.out.println(bool1 + ", " + bool2);

        char c1 = '\u0078', c2 = 'x', c3 = 120;
        System.out.println(c1 + ", " + c2 + ", " + c3);
    }
}
