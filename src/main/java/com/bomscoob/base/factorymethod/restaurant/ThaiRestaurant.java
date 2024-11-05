package com.bomscoob.base.factorymethod.restaurant;

public class ThaiRestaurant extends Restaurant {
    public ThaiRestaurant(String name, String address, RestaurantSize size) {
        super(name, address, "Pad Thai", size);
    }
}
