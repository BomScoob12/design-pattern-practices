package com.bomscoob.base.creational.factorymethod.restaurant.concrete;

import com.bomscoob.base.creational.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantCuisines;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantSize;

// Concrete Product
public class JapaneseRestaurant extends Restaurant {
    public JapaneseRestaurant(String name, RestaurantSize size) {
        super(name,"Sushi", size, RestaurantCuisines.JAPANESE);
    }
}
