package com.bomscoob.base.creational.abstractfactory.factory;

import com.bomscoob.base.creational.abstractfactory.product.type.Button;
import com.bomscoob.base.creational.abstractfactory.product.type.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
