package com.bomscoob.base.creational.factorymethod.restaurant.concrete;

import com.bomscoob.base.creational.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantCuisines;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantSize;

// Concrete Product
public class DefaultRestaurant extends Restaurant {
    public DefaultRestaurant(String name, RestaurantSize size) {
        super(name, "Dim sum (default)", size, RestaurantCuisines.THAI);
    }
}
