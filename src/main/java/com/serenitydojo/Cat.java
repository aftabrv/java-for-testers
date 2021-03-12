package com.serenitydojo;

public class Cat extends Pet{

    private String name, food;
    private int age;

    public Cat( String name, String food, int age) {
        super(name, age);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public String makeNoise(){
        return "Meow";

    }
    public String play(){
        return "plays with string";
    }


}
