package com.serenitydojo;

public class Dog extends Pet{

    private String name, food;
    private int age;


    public Dog( String name, String food, int age) {
        super(name, age);
        this.food = food;
            }

    public String getFavoriteToy() {
        return food;
    }


    @Override
    public String makeNoise() {
        return "Woff";
    }

    public String play(){
        return "plays with bone";
    }
}
