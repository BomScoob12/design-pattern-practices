package com.bomscoob.base.factorymethod.restaurant;

public class JapaneseRestaurant extends Restaurant{
    public JapaneseRestaurant(String name, String address, RestaurantSize size) {
        super(name, address, "Sushi", size);
    }
}
