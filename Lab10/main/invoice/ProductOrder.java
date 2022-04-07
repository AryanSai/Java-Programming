package main.invoice;

import main.products.Product;
import main.products.db.ProductDB;

public class ProductOrder implements Comparable<Product> {
    Product p;
    double qty, total;
    static int orderObjectCount;
    String code;

    public ProductOrder(String _code, int _qty) {
        code=_code;
        p = ProductDB.getProduct(code);
        qty = _qty;
        total = _qty * p.getPrice();
    }

    @Override
    public int compareTo(Product p) {
        return 0;
    }

    public String toString(){
        return "Code: " + code + "\n" +
               "Quantity: " + qty + "\n" +
               "Total: " + total + "\n" ;
    }

}
