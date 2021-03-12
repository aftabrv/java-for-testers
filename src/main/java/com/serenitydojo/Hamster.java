package com.serenitydojo;

public class Hamster extends Pet {
    private String name, favouriteGame;
    private int age;

    public Hamster( String name, String favouriteGame, int age) {
        super(name, age);
        this.favouriteGame = favouriteGame;
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    @Override
    public String makeNoise() {
        return null;
    }


    public String play(){
        return "runs in wheel";
    }
}
