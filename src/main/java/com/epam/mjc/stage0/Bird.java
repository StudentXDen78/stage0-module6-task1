package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    @Override
     public String getDescription() {
        String result;
        result = super.getDescription() + " Moreover, it has 2 wings and can fly.";
        System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        Animal bird = new Bird();
    }
}
