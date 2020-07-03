package com.codegym.productsmanager;

public class MyApp {
    public static void main(String[] args) {
        TextFileExporter textFileExporter = new TextFileExporter();
        ExcelFileExporter excelFileExporter = new ExcelFileExporter();


        ProductManager productManager = new ProductManager();
        productManager.saveFile(excelFileExporter, "data.txt");

    }
}
