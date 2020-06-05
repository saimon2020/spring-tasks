package test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Duck implements Animal {
    public void voice() {
        System.out.println("crya");
    }

    @Override
    public List<FoodType> getPossibleFeedTypes() {
        List<FoodType> breakfast = new ArrayList<FoodType>();
        breakfast.add(FoodType.WORM);
        breakfast.add(FoodType.FISH);
        breakfast.add(FoodType.GRASS);
        return breakfast;
    }
}