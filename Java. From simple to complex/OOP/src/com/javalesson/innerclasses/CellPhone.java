package com.javalesson.innerclasses;

public class CellPhone {
    private String make;
    private String model;
    private Display display;
    private RadioModule gsm;

    public CellPhone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void turnOn() {
        initDisplay();
        gsm = new RadioModule();
    }

    public void call(String number){
        gsm.call(number);
    }

    private void initDisplay(){
        display = new Display();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Display getDisplay() {
        return display;
    }
}
