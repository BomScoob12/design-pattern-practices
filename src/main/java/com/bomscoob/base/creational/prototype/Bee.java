package com.bomscoob.base.creational.prototype;

public class Bee extends Monster{
    public Bee(String name) {
        super(name);
    }

    @Override
    public Monster cloneMonster() {
        return new Bee(super.getName());
    }
}
