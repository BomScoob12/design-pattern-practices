package com.bomscoob.base.creational.factorymethod.factory.concrete;

import com.bomscoob.base.creational.factorymethod.factory.creator.RestaurantFactory;
import com.bomscoob.base.creational.factorymethod.restaurant.concrete.DefaultRestaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantSize;

public class DefaultRestaurantFactory extends RestaurantFactory {
    @Override
    public Restaurant createRestaurant(String name, RestaurantSize size) {
        return new DefaultRestaurant(name, size);
    }
}
