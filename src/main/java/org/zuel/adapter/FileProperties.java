package org.zuel.adapter;

import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream inputStream = new FileInputStream(filename);
        super.load(inputStream);
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        OutputStream outputStream = new FileOutputStream(filename);
        super.store(outputStream,"#written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        super.setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return (String) super.get(key);
    }
}
