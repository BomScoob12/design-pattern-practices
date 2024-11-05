package com.bomscoob.base.factorymethod.factory;

import com.bomscoob.base.factorymethod.restaurant.DefaultRestaurant;
import com.bomscoob.base.factorymethod.restaurant.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.RestaurantSize;

public class DefaultRestaurantFactory implements IFactoryRestaurant{
    public Restaurant createRestaurant(String name, RestaurantSize size) {
        return new DefaultRestaurant(name, size);
    }
}
