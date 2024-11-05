package com.bomscoob.base.factorymethod.factory;

import com.bomscoob.base.factorymethod.restaurant.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.RestaurantSize;
import com.bomscoob.base.factorymethod.restaurant.ThaiRestaurant;

// Concrete Creator
public class ThaiRestaurantFactory implements IFactoryRestaurant {
    public Restaurant createRestaurant(String name, RestaurantSize size) {
        return new ThaiRestaurant(name, size);
    }
}
