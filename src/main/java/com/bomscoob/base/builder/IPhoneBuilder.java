package com.bomscoob.base.builder;

public interface IPhoneBuilder {
    IPhoneBuilder addCpu(CpuList cpu);
    IPhoneBuilder addRam(int ram);
    IPhoneBuilder addRom(int rom);
    IPhoneBuilder addCamera(boolean cam);
    Phone build();
}
