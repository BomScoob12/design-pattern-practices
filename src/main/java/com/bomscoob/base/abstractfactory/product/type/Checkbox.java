package com.bomscoob.base.abstractfactory.product.type;

public abstract class Checkbox {
    private final String supportOS;
    public Checkbox(String supportOS) {
        this.supportOS = supportOS;
    }

    public String getSupportOS() {
        return this.supportOS;
    }

    @Override
    public String toString() {
        return "Checkbox{" +
                "supportOS='" + supportOS + '\'' +
                '}';
    }
}
