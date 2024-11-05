package com.bomscoob;

import com.bomscoob.base.builder.CpuList;
import com.bomscoob.base.builder.Phone;
import com.bomscoob.base.factorymethod.factory.JapaneseRestaurantFactory;
import com.bomscoob.base.factorymethod.restaurant.Restaurant;
import com.bomscoob.base.factorymethod.restaurant.RestaurantCuisines;
import com.bomscoob.base.factorymethod.restaurant.RestaurantSize;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
//        testBuilderPattern();
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
//        Restaurant bomScopeRestaurant = JapaneseRestaurantFactory("YamYam", RestaurantSize.LARGE);

//        logger.info(bomScopeRestaurant.toString());
    }
}