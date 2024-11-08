package com.bomscoob;

import com.bomscoob.base.builder.CpuList;
import com.bomscoob.base.builder.Phone;
import com.bomscoob.base.factorymethod.factory.creator.RestaurantFactory;
import com.bomscoob.base.factorymethod.factory.concrete.JapaneseRestaurantFactory;
import com.bomscoob.base.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.product.RestaurantSize;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        testBuilderPattern();
        testFactoryMethod();
    }

    private static void testBuilderPattern() {
        Phone onlyCam = new Phone.Builder().addCamera(true).build();
        Phone samsung = new Phone.Builder()
                .addCpu(CpuList.SNAP_DRAG_V3)
                .addRam(2048)
                .addRom(256)
                .addCamera(true)
                .build();

        logger.info(onlyCam.toString());
        logger.info(samsung.toString());
    }

    private static void testFactoryMethod() {
        RestaurantFactory restaurantFactory = new JapaneseRestaurantFactory();
        Restaurant bomJapRestaurant = restaurantFactory.createRestaurant("BOM", RestaurantSize.MEDIUM);
        Restaurant tewJapRestaurant = restaurantFactory.createRestaurant("TEW_JOJA", RestaurantSize.MEDIUM);
        logger.info(bomJapRestaurant.toString());
        logger.info(tewJapRestaurant.toString());
    }
}