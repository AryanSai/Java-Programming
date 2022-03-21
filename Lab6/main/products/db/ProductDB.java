package main.products.db;

import main.products.*;

public class ProductDB{
    public static Product getProduct(String productCode){
        
        Product p = null;
        if (productCode.equalsIgnoreCase("java")){
            Book b = new Book("java", "Murach's Beginning Java 2", 49.50, "Andrea Steelman");
            p = b;
        }
        else if (productCode.equalsIgnoreCase("jsps")){
            Book b = new Book("jsps","Murach's Java Servlets and JSP",49.50,"Andrea Steelman");
            p = b;
        }
        else if (productCode.equalsIgnoreCase("mcb2")){
            Book b = new Book("mcb2","Murach's Mainframe COBOL",59.50,"Mike Murach");
            p = b;
        }
        else if (productCode.equalsIgnoreCase("txtpd")){
            Software s = new Software("txtp","TextPad",27.00,"4.7.3");
            p = s; 
        }
        else if (productCode.equalsIgnoreCase("wrdpd")){
			Software s = new Software("wrdpd","Word Pad",37.00,"6.3.3");
			p = s; // set Product object equal to the Software object
        }
        else{
            return null;
        }
        return p;
    }
}