package com.haulmot.smalllib;

public class FileApi {
    public void scan(FilePointer path) {
        System.out.println("Scan file");
    }

    public void scan(DirectoryPointer dir) {
        System.out.println("Scan directory");
    }
}