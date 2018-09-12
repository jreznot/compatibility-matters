package com.haulmont.demo

import com.haulmot.smalllib.DirectoryPointer
import com.haulmot.smalllib.FileApi
import com.haulmot.smalllib.FilePointer;

class MainGroovy {
    static void main(String[] args) {
        def file = mkFile()

        new FileApi().scan(file)
    }

    static FilePointer mkFile() {
        new DirectoryPointer() {}
    }
}