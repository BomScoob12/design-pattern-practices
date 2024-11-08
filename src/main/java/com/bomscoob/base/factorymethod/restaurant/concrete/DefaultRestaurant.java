package com.bomscoob.base.factorymethod.restaurant.concrete;

import com.bomscoob.base.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.product.RestaurantSize;

// Concrete Product
public class DefaultRestaurant extends Restaurant {
    public DefaultRestaurant(String name, RestaurantSize size) {
        super(name, "Dim sum (default)", size);
    }
}
