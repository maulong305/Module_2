package com.codegym.productsmanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void saveFile(IExporter exporter, String path) {
        exporter.export(path);
    }

}
