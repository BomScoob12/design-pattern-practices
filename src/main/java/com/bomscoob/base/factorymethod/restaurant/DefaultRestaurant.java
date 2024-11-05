package com.bomscoob.base.factorymethod.restaurant;

public class DefaultRestaurant extends Restaurant{
    public DefaultRestaurant(String name, String signatureMenu, RestaurantSize size) {
        super(name, signatureMenu, size);
    }
}
