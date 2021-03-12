import com.serenitydojo.Feeder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.serenitydojo.AnimalType.*;
import static com.serenitydojo.FoodType.*;

public class FeedingTheAnimals {

    @Test
    public void feedCatTuna(){
        Feeder feeder = new Feeder();
        System.out.println(feeder.feeds(CAT, false));
        Assert.assertEquals(feeder.feeds(CAT, false), Tuna);

    }

    @Test
    public void feedHamsterCabbage(){
        Feeder feeder = new Feeder();
        System.out.println(feeder.feeds(HAMSTER, false));
        Assert.assertEquals(feeder.feeds(HAMSTER, false), Cabbage);

    }

    @Test
    public void feedDogMeat(){
        Feeder feeder = new Feeder();
        System.out.println(feeder.feeds(DOG, true));
        Assert.assertEquals(feeder.feeds(DOG, true), Delux_dog_food);

    }

    @Test
    public void feedPremium(){
        Feeder feeder = new Feeder();
        System.out.println(feeder.feeds(CAT, true));
        Assert.assertEquals(feeder.feeds(CAT, true), Salmon);

    }

    @Test
    public void listOfColors(){
        String[] color = new String[3];
        color[0] = "Red";
        color[1] = "Yellow";
        color[2] = "Green";

        for(int i = 0; i<3; i++){
            System.out.println(color[i]);
        }


    }

    @Test
    public void moreColors() {
        List<String> moreColors = new ArrayList<>();
        moreColors.add("Red");
        moreColors.add("Yellow");
        moreColors.add("Green");

        for (String calar : moreColors){
            System.out.println(calar);

        }



        }

    }




