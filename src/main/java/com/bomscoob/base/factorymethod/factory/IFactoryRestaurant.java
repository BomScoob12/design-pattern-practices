package com.bomscoob.base.factorymethod.factory;

import com.bomscoob.base.factorymethod.restaurant.*;

// Creator interface/abstract
public interface IFactoryRestaurant {
    Restaurant createRestaurant(String name, RestaurantSize size) {
        return DefaultRestaurantFactory.createRestaurant(name, size);
    }
}
