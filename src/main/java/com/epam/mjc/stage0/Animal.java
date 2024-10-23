package com.epam.mjc.stage0;

public class Animal {
    String color;
    int numberOfPaws;
    boolean hasFur;

    public Animal(String color,  int numberOfPaws, boolean hasFur) {
        getDescription(color, numberOfPaws,hasFur);
    }

    public String getDescription(String color, int numberOfPaws, boolean hasFur) {
        String result;
        String fur;
        if (hasFur) {
            fur = "a";
        }
        else fur = "no";
        result = "This " + "animal is mostly +" + color +". It has + " + numberOfPaws + "paws and " + fur +" fur.";
        return result;
    }
}
