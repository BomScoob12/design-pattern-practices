package com.bomscoob.base.factorymethod.restaurant.product;

// Product
public abstract class Restaurant {
    private String name;
    private String signatureMenu;
    private RestaurantSize size;
    private RestaurantCuisines cuisines;
    public Restaurant(String name, String signatureMenu, RestaurantSize size, RestaurantCuisines cuisines) {
        this.name = name;
        this.signatureMenu = signatureMenu;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSignatureMenu() {
        return signatureMenu;
    }

    public void setSignatureMenu(String signatureMenu) {
        this.signatureMenu = signatureMenu;
    }

    public RestaurantSize getSize() {
        return size;
    }

    public void setSize(RestaurantSize size) {
        this.size = size;
    }

    public RestaurantCuisines getCuisines() {
        return cuisines;
    }

    public void setCuisines(RestaurantCuisines cuisines) {
        this.cuisines = cuisines;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", signatureMenu='" + signatureMenu + '\'' +
                ", size=" + size +
                '}';
    }
}
