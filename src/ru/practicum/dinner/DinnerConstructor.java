package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    Random random = new Random();
    HashMap<String, ArrayList<String>> Menu = new HashMap<>();
    ArrayList<String> dishes;

    Boolean isTypeExist(String type) {
        return Menu.containsKey(type);
    }


    void AddDishes(String type, String dish) {
        if (isTypeExist(type)) {
            dishes = Menu.get(type);
            dishes.add(dish);
            Menu.put(type, dishes);
        } else {
            ArrayList<String> dishes = new ArrayList<>();
            dishes.add(dish);
            Menu.put(type, dishes);
        }
    }

    //HashMap<Integer, ArrayList<String>> comboOfDishes = new HashMap<>();

    void generationComboOfDishes(int count, ArrayList<String> type) {

        for (int i = 1; i <= count; i++) {
            ArrayList<String> combo = new ArrayList<>();

            for (String typeDish : type) {
                dishes = Menu.get(typeDish);
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
