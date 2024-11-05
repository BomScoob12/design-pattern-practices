package com.bomscoob;

import com.bomscoob.base.builder.CpuList;
import com.bomscoob.base.builder.Phone;

public class Main {
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

        System.out.println(onlyCam);
        System.out.println(samsung);
    }
}