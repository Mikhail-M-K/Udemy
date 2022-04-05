package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {

        Dog labrador = new Dog();
        labrador.setName("Charley");
        labrador.setBreed("Lab");
        labrador.setSize(Size.AVERAGE);
        labrador.bite();

        Dog sheppard = new Dog();
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        sheppard.setSize(Size.BIG);
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setName("Jack");
        doberman.setBreed("Doberman");
        doberman.setSize(Size.BIG);
        doberman.bite();

        Size s = Size.SMALL;
        Size s1 = Size.valueOf("BIG");

        Size[] values = Size.values();
        for(int i=0; i< values.length;i++) {
            System.out.println(values[i]);
        }
    }

}
