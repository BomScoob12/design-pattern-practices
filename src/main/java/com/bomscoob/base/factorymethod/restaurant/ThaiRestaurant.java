package com.bomscoob.base.factorymethod.restaurant;

// Concrete Product
public class ThaiRestaurant extends Restaurant {
    public ThaiRestaurant(String name, RestaurantSize size) {
        super(name, "Pad Thai", size);
    }
}