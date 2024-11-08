package com.bomscoob;

import com.bomscoob.base.creational.abstractfactory.factory.GUIFactory;
import com.bomscoob.base.creational.abstractfactory.factory.MacGUIFactory;
import com.bomscoob.base.creational.abstractfactory.factory.WinGUIFactory;
import com.bomscoob.base.creational.abstractfactory.product.type.Button;
import com.bomscoob.base.creational.abstractfactory.product.type.Checkbox;
import com.bomscoob.base.creational.builder.CpuList;
import com.bomscoob.base.creational.builder.Phone;
import com.bomscoob.base.creational.factorymethod.factory.creator.RestaurantFactory;
import com.bomscoob.base.creational.factorymethod.factory.concrete.JapaneseRestaurantFactory;
import com.bomscoob.base.creational.factorymethod.restaurant.product.Restaurant;
import com.bomscoob.base.creational.factorymethod.restaurant.product.RestaurantSize;
import com.bomscoob.base.creational.prototype.Bee;
import com.bomscoob.base.creational.prototype.Monster;
import com.bomscoob.base.creational.singleton.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
//        testBuilderPattern();
//        testFactoryMethod();
//        testAbstractFactory();
//        testPrototype();
        testSingleton();
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

    private static void testAbstractFactory() {
        if (System.getenv("OS").contains("Win")) {
            GUIFactory winFactory = new WinGUIFactory();
            Button wBtn = winFactory.createButton();
            Checkbox wCkb = winFactory.createCheckbox();
            logger.info("WINDOWS COMPONENT");
            logger.info(wBtn.toString() + wCkb.toString());
        } else if (System.getenv("OS").contains("Mac")){
            GUIFactory macFactory = new MacGUIFactory();
            Button mBtn = macFactory.createButton();
            Checkbox mCkb = macFactory.createCheckbox();
            logger.info("MAC COMPONENT");
            logger.info(mBtn.toString() + mCkb.toString());
        } else {
            logger.warning("Unknown OS");
        }
    }

    private static void testPrototype() {
        Monster bee1 = new Bee("B1");
        Monster bee2 = bee1.cloneMonster();

        logger.info(bee1.toString());
        logger.info(bee2.toString());
    }

    private static void testSingleton() {
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM sample_db.customers");
            int columnCount = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()) {
                // the number of column start from 1
                for (int i = 1 ; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }

                System.out.println();
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}