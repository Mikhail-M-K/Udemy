package com.javalesson.interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {
        Pricable pizza = new Pizza("Neapolitano",1,20,Size.L);
        Pricable phone = new CellPhone("Motorola", "XT1575",1,250);
        Pricable fridge = new Fridge("LG", "E9090",1,300);

        printDeliverablePrice(pizza);
        printDeliverablePrice(phone);
        printDeliverablePrice(fridge);
    }
    private static void printDeliverablePrice(Pricable del){
        System.out.println("Delivery prise " + del.calDeliveryPrice());
        System.out.println("Delivery prise " + del.calOrderPrice());
    }
}
