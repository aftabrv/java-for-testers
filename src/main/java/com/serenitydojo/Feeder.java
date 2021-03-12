package com.serenitydojo;

import static com.serenitydojo.FoodType.*;
import static com.serenitydojo.FoodType.Tuna;

public class Feeder {
    public String animal;

    public FoodType feeds(AnimalType animal, Boolean isPremium){
        /*

        if (animal.equals("Cat"))
            if(isPremium)
                return "Salmon";
            else
               return ("Tuna");

        else if(animal.equals("Dog"))
                return "Meat";
        else
            return "Cabbage";

         */
        switch (animal){
            case CAT:
                return (isPremium)? Salmon : Tuna;
            case DOG:
                return (isPremium)? Delux_dog_food : Meat;
            case HAMSTER:
                return (isPremium)? Lettuce : Cabbage;

            default:
                return Do_Not_Know;

        }


    }


}
