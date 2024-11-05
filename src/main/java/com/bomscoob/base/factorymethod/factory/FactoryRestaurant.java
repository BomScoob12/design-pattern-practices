package com.bomscoob.base.factorymethod.factory;

import com.bomscoob.base.factorymethod.restaurant.*;

public class FactoryRestaurant implements IFactoryRestaurant{
    @Override
    public Restaurant getRestaurant(String name, RestaurantCuisines cuisines, RestaurantSize size) {
        switch (cuisines) {
            case THAI -> {
                return new ThaiRestaurant(name, size);
            }
            case JAPANESE -> {
                return new JapaneseRestaurant(name, size);
            }
            default -> {
                return new DefaultRestaurant(name, "Default menu", size);
            }
        }
    }
}
