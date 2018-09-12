package com.haulmont.cooladdon;

import com.haulmont.coollib.TextField;

public class RichTextField extends TextField {
    @Override
    protected RichTextField getThis() {
        return (RichTextField) super.getThis();
    }

    @Override
    public String toString() {
        return "" + getThis().getClass();
    }
}