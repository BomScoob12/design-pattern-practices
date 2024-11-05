package com.bomscoob.base.factorymethod.restaurant;

// Concrete Product
public class DefaultRestaurant extends Restaurant{
    public DefaultRestaurant(String name, RestaurantSize size) {
        super(name, "Dim sum (default)", size);
    }
}
