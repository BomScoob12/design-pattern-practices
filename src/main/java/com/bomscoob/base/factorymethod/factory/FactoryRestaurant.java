package com.bomscoob.base.factorymethod.factory;

import com.bomscoob.base.factorymethod.restaurant.RestaurantCuisines;

public class FactoryRestaurant implements IFactoryRestaurant{
    @Override
    public IFactoryRestaurant getRestaurant(RestaurantCuisines cuisines) {
        return null;
    }
}
