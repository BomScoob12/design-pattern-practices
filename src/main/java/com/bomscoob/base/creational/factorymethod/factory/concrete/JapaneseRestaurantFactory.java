package com.bomscoob.base.creational.factorymethod.factory.concrete;

import com.bomscoob.base.creational.factorymethod.factory.creator.RestaurantFactory;
import com.bomscoob.base.creational.factorymethod.restaurant.concrete.JapaneseRestaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantSize;

// Concrete Creator
public class JapaneseRestaurantFactory extends RestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name, RestaurantSize size) {
        return new JapaneseRestaurant(name, size);
    }
}
