package com.bomscoob.base.creational.prototype;

public abstract class Monster implements Prototype {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //can not override Objects.clone() in java, named clone monster instead.
    public abstract Monster cloneMonster();

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                '}';
    }
}
