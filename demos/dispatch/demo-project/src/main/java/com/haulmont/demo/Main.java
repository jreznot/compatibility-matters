package com.haulmont.demo;

import com.haulmot.smalllib.DirectoryPointer;
import com.haulmot.smalllib.FileApi;

public class Main {
    public static void main(String[] args) {
        DirectoryPointer pointer = new DirectoryPointer() {
        };

        new FileApi().scan(pointer);
    }
}