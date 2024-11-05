package com.bomscoob.base.builder;

public class PhoneShop {

    private CpuType cpuType;
    private int ram;
    private int rom;
    private boolean camera;

    private PhoneShop() {}

    public static PhoneShop Builder() {
        return this;
    }


}

enum CpuType {
    SNAP_DRAG_V1,
    SNAP_DRAG_V2,
    SNAP_DRAG_V3,
    SNAP_DRAG_V4
}
