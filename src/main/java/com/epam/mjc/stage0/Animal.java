package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color,  int numberOfPaws, boolean hasFur) {
         this.color = color;
         this.numberOfPaws = numberOfPaws;
         this.hasFur = hasFur;
         getDescription();
    }

    public String getDescription() {
        String result;
        String fur;
        fur = hasFur ? "a" : "no";
        String somePaw;
        somePaw = numberOfPaws > 1 ? "paws" : "paw";
        result = "This " + "animal is mostly " + color +". It has " + numberOfPaws + " " + somePaw + " and " + fur +" fur.";
        return result;
    }
}
