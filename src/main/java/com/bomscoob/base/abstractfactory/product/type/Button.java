package com.bomscoob.base.abstractfactory.product.type;

public abstract class Button {
    private final String supportOS;
    public Button(String supportOS) {
        this.supportOS = supportOS;
    }

    public String getSupportOS() {
        return this.supportOS;
    }

    @Override
    public String toString() {
        return "Button{" +
                "supportOS='" + supportOS + '\'' +
                '}';
    }
}
