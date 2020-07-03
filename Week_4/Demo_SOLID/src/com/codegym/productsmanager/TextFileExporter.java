package com.codegym.productsmanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TextFileExporter implements IExporter {
    @Override
    public File export(String path) {
        File file = new File(path);

        try {
            FileOutputStream os = new FileOutputStream(file);
            // ghi file o day
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return file;
    }
}
