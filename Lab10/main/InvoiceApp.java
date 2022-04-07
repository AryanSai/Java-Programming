package main;

import main.products.Product;
import main.products.db.ProductDB;
import main.utility.Validator1;

public class InvoiceApp {
    public static void main(String[] args) {
        String flag;
        do {
            System.out.println("----Invoice App----");
            Product p = ProductDB.getProduct(Validator1.getString("Type the product code: "));
            int qty = Validator1.getInt("Type the quantity: ");

            if (p == null) { 
                System.out.println("No product matches this product code.");
            } else {
                createdProducts[index] = p;
                index++;
                System.out.println("Product added to the array.");
            }
            Arrays.sort(createdProducts, 0, index);

            flag = Validator1.getString("Type 'done' to stop the order:"); // written a new function for getting characters
        } while (ch == 'y');
    }
}