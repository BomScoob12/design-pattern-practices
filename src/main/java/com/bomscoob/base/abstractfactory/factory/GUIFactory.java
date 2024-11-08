package com.bomscoob.base.abstractfactory.factory;

import com.bomscoob.base.abstractfactory.product.type.Button;
import com.bomscoob.base.abstractfactory.product.type.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
