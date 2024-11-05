package com.bomscoob;

import com.bomscoob.base.builder.CpuList;
import com.bomscoob.base.builder.Phone;

import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        testBuilderPattern();
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
}