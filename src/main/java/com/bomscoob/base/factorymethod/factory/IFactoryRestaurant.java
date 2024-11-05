package com.bomscoob.base.factorymethod.factory;

import com.bomscoob.base.factorymethod.restaurant.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.RestaurantCuisines;
import com.bomscoob.base.factorymethod.restaurant.RestaurantSize;

// Creator interface
public interface IFactoryRestaurant {
    Restaurant getRestaurant(String name, RestaurantCuisines cuisines, RestaurantSize size);
}
