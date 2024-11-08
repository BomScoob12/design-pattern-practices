package com.bomscoob.base.factorymethod.restaurant.concrete;

import com.bomscoob.base.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.product.RestaurantSize;

// Concrete Product
public class JapaneseRestaurant extends Restaurant {
    public JapaneseRestaurant(String name, RestaurantSize size) {
        super(name,"Sushi", size);
    }
}