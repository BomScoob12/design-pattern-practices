package com.bomscoob.base.creational.factorymethod.restaurant.concrete;

import com.bomscoob.base.creational.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantCuisines;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantSize;

// Concrete Product
public class ThaiRestaurant extends Restaurant {
    public ThaiRestaurant(String name, RestaurantSize size) {
        super(name, "Pad Thai", size, RestaurantCuisines.THAI);
    }
}
