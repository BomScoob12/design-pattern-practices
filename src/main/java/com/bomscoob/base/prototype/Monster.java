package com.bomscoob.base.prototype;

public class Monster implements Prototype {
    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public Monster(Monster monster) {
        this.name = monster.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    // can not use clone because it override the Objects.clone()
    @Override
    public Monster cloneMonster() {
        return new Monster(this.name);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                '}';
    }
}
