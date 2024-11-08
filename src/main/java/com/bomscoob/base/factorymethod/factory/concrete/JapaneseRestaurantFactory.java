package com.bomscoob.base.factorymethod.factory.concrete;

import com.bomscoob.base.factorymethod.factory.creator.IFactoryRestaurant;
import com.bomscoob.base.factorymethod.restaurant.concrete.JapaneseRestaurant;
import com.bomscoob.base.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.product.RestaurantSize;

// Concrete Creator
public class JapaneseRestaurantFactory implements IFactoryRestaurant {
    public Restaurant createRestaurant(String name, RestaurantSize size) {
        return new JapaneseRestaurant(name, size);
    }
}
