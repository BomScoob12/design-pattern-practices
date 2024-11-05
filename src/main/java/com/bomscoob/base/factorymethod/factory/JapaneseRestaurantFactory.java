package com.bomscoob.base.factorymethod.factory;

import com.bomscoob.base.factorymethod.restaurant.JapaneseRestaurant;
import com.bomscoob.base.factorymethod.restaurant.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.RestaurantSize;
import com.bomscoob.base.factorymethod.restaurant.ThaiRestaurant;

// Concrete Creator
public class JapaneseRestaurantFactory implements IFactoryRestaurant {
    public Restaurant createRestaurant(String name, RestaurantSize size) {
        return new JapaneseRestaurant(name, size);
    }
}
