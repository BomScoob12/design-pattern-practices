package com.bomscoob.base.factorymethod.factory.concrete;

import com.bomscoob.base.factorymethod.factory.creator.RestaurantFactory;
import com.bomscoob.base.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.product.RestaurantSize;
import com.bomscoob.base.factorymethod.restaurant.concrete.ThaiRestaurant;

// Concrete Creator
public class ThaiRestaurantFactory extends RestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name, RestaurantSize size) {
        return new ThaiRestaurant(name, size);
    }
}
