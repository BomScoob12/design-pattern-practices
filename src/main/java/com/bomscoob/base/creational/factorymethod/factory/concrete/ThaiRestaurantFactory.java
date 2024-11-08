package com.bomscoob.base.creational.factorymethod.factory.concrete;

import com.bomscoob.base.creational.factorymethod.factory.creator.RestaurantFactory;
import com.bomscoob.base.creational.factorymethod.restaurant.concrete.ThaiRestaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantSize;

// Concrete Creator
public class ThaiRestaurantFactory extends RestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name, RestaurantSize size) {
        return new ThaiRestaurant(name, size);
    }
}
