package com.bomscoob.base.creational.abstractfactory.factory;

import com.bomscoob.base.creational.abstractfactory.product.mac.MacButton;
import com.bomscoob.base.creational.abstractfactory.product.mac.MacCheckbox;
import com.bomscoob.base.creational.abstractfactory.product.type.Button;
import com.bomscoob.base.creational.abstractfactory.product.type.Checkbox;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
