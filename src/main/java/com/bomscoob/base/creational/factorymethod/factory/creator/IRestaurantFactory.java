package com.bomscoob.base.creational.factorymethod.factory.creator;

import com.bomscoob.base.creational.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantSize;

// Creator interface/abstract
public interface IRestaurantFactory {
    Restaurant createRestaurant(String name, RestaurantSize size);
}
