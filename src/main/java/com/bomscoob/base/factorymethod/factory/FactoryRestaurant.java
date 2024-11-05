package com.bomscoob.base.factorymethod.factory;

import com.bomscoob.base.factorymethod.restaurant.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        }
        throw new IllegalArgumentException("Cannot found Cuisines type.");
    }

    @Override
    public Restaurant getDefaultRestaurant() {
        return new DefaultRestaurant("Default restaurant", "Default menu", RestaurantSize.MEDIUM);
    }
}
