package com.bomscoob.base.factorymethod.factory.creator;

import com.bomscoob.base.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.product.RestaurantSize;

public abstract class FactoryRestaurant implements IFactoryRestaurant{
    public abstract Restaurant createRestaurant(String name, RestaurantSize size);
}
