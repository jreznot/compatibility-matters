package com.haulmont.demo;

import com.haulmont.cooladdon.RichTextField;

public class MyRichTextField extends RichTextField {
    @Override
    protected MyRichTextField getThis() {
        return (MyRichTextField) super.getThis();
    }
}