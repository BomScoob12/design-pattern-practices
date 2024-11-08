package com.bomscoob.base.creational.factorymethod.factory.creator;

import com.bomscoob.base.creational.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantSize;

public abstract class RestaurantFactory implements IRestaurantFactory {
    public abstract Restaurant createRestaurant(String name, RestaurantSize size);
}
