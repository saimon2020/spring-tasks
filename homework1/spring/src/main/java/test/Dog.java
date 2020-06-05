package test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Dog implements Animal {
    public void voice() {
        System.out.println("gav");
    }

    @Override
    public List<FoodType> getPossibleFeedTypes() {
        List<FoodType> breakfast = new ArrayList<FoodType>();
        breakfast.add(FoodType.FISH);
        breakfast.add(FoodType.MILK);
        return breakfast;
    }
}
