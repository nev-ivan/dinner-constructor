package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    Random random = new Random();
    HashMap<String, ArrayList<String>> menu = new HashMap<>();
    ArrayList<String> dishes;

    Boolean isTypeExist(String type) {
        return menu.containsKey(type);
    }


    void AddDishes(String type, String dish) {

        if (isTypeExist(type)) {
            dishes = menu.get(type);
        } else {
            dishes = new ArrayList<>();
        }
        dishes.add(dish);
        menu.put(type, dishes);
    }

    void generationComboOfDishes(int count, ArrayList<String> type) {

        for (int i = 1; i <= count; i++) {
            ArrayList<String> combo = new ArrayList<>();

            for (String typeDish : type) {
                dishes = menu.get(typeDish);
                int num = dishes.size();

                String dish = dishes.get(random.nextInt(num));
                combo.add(dish);

            }
            System.out.println("Бизнес ланч номер " + (i) + " :");
            System.out.println(combo);
            System.out.println("--");
        }

    }


}
