package com.bomscoob.base.builder;

public class Phone {

    private CpuList cpuType;
    private int ram;
    private int rom;
    private boolean camera;

    public Phone(CpuList cpuType, int ram, int rom, boolean camera) {
        this.cpuType = cpuType;
        this.ram = ram;
        this.rom = rom;
        this.camera = camera;
    }

    public CpuList getCpuType() {
        return cpuType;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCpuType(CpuList cpuType) {
        this.cpuType = cpuType;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpuType=" + cpuType +
                ", ram=" + ram +
                ", rom=" + rom +
                ", camera=" + camera +
                '}';
    }

    public static class Builder implements IPhoneBuilder {
        private CpuList cpuType;
        private int ram;
        private int rom;
        private boolean camera;


        @Override
        public Builder addCpu(CpuList cpu) {
            this.cpuType = cpu;
            return this;
        }

        @Override
        public Builder addRam(int ram) {
            this.ram = ram;
            return this;
        }

        @Override
        public Builder addRom(int rom) {
            this.rom = rom;
            return this;
        }

        @Override
        public Builder addCamera(boolean cam) {
            this.camera = cam;
            return this;
        }

        @Override
        public Phone build() {
            return new Phone(cpuType, ram, rom, camera);
        }
    }
}