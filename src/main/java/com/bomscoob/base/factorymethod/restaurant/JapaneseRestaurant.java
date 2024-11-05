package com.bomscoob.base.factorymethod.restaurant;

// Concrete Product
public class JapaneseRestaurant extends Restaurant{
    public JapaneseRestaurant(String name, RestaurantSize size) {
        super(name,"Sushi", size);
    }
}
