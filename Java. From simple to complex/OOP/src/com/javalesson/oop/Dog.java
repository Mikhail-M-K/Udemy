package com.javalesson.oop;

public class Dog {

    private static int dogsCount;

    public final int PAWS = 4; //количество лап
    public final int TAIL = 1; //количество хвостов
    private String name = ""; //кличка
    private String breed = ""; //порода
    private Size size = Size.UNDEFINED; //размер

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    //задает имя
    public void setName(String name) {
        this.name = name; // this указывает на поле в классе
    }

    //возвращает имя
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() { // меиод "лай"
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Wof - Wof");
                break;
            case AVERAGE:
                System.out.println("Raf - Raf");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tiaf - Tiaf");
                break;
            default:
                System.out.println("Dog's size is undefined");
        }
    }

    public void bite() { // меиод "кусать"
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }
    }
}
