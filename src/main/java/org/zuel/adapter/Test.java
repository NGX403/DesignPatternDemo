package org.zuel.adapter;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src/main/java/org/zuel/adapter/file.txt");
            f.setValue("year","2024");
            f.setValue("month","10");
            f.setValue("day","6");
            f.writeToFile("src/main/java/org/zuel/adapter/newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
