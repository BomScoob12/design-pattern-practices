package com.bomscoob.base.factorymethod.factory;

import com.bomscoob.base.factorymethod.restaurant.RestaurantCuisines;

// Creator interface
public interface IFactoryRestaurant {
    IFactoryRestaurant getRestaurant(RestaurantCuisines cuisines);
}
