package com.bomscoob.base.abstractfactory.factory;

import com.bomscoob.base.abstractfactory.product.type.Button;
import com.bomscoob.base.abstractfactory.product.type.Checkbox;
import com.bomscoob.base.abstractfactory.product.win.WinButton;
import com.bomscoob.base.abstractfactory.product.win.WinCheckbox;

public class WinGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
