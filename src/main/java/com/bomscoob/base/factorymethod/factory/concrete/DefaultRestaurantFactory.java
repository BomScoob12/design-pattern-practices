package com.bomscoob.base.factorymethod.factory.concrete;

import com.bomscoob.base.factorymethod.factory.creator.IFactoryRestaurant;
import com.bomscoob.base.factorymethod.restaurant.concrete.DefaultRestaurant;
import com.bomscoob.base.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.product.RestaurantSize;

public class DefaultRestaurantFactory implements IFactoryRestaurant {
    public Restaurant createRestaurant(String name, RestaurantSize size) {
        return new DefaultRestaurant(name, size);
    }
}
