package com.bomscoob.base.factorymethod.factory.creator;

import com.bomscoob.base.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.product.RestaurantSize;

// Creator interface/abstract
public interface IFactoryRestaurant {
    Restaurant createRestaurant(String name, RestaurantSize size);
}
