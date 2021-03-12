package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class writeObjects {
    /*

    @Test

    public void describeCat(){
        Cat tom = new Cat();
        tom.setName("Tom");
        tom.setFood("Tuna");
        tom.setColor("Black");
        System.out.println(tom.getName());

    }

     */

    @Test

    public void creating_a_dog(){
        Dog dog = new Dog("Fido","Bone", 5);
        Assert.assertEquals(dog.getName(), "Fido");
        Assert.assertEquals(dog.getFavoriteToy(), "Bone");
        Assert.assertEquals(dog.getAge(), 5);

    }
    @Test
    public void CreatingHamster(){
        Hamster hamster = new Hamster("Rocky", "Running", 1);
        Assert.assertEquals(hamster.getName(), "Rocky");
        Assert.assertEquals(hamster.getFavouriteGame(), "Running");
        Assert.assertEquals(hamster.getAge(), 1);


    }
    @Test
    public void creatingCat(){
        Pet kitty = new Cat("Kitty","Salmon",3);
        System.out.println("Kitty goes "+ kitty.makeNoise());
        Pet doggy = new Dog("doggy","oats",3);
        System.out.println("Doggy makes "+ doggy.makeNoise());
        Pet judo = new Hamster("Judo","WHeel",1);
        System.out.println("Hamster goes "+judo.makeNoise());


    }
    @Test
    public void PetsCanPlay(){
        Pet catty = new Cat("catty","Salmon",3);
        System.out.println("catty" + catty.play());
        Pet moti =new Dog("moti","bones",3);
        System.out.println("Moti "+ moti.play());
        Pet zingo = new Hamster("zingo","wheel",1);
        System.out.println("Zingo "+ zingo.play());
    }



}
