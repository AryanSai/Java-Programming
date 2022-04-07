import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductApp1 {
    public static void main(String args[]) {
        char ch = 'y', tagChar;
        // list of products
        List<Product> productList = new LinkedList<Product>();

        do {
            Product p = ProductDB.getProduct(Validator1.getString("Type the product code:"));
            if (p == null) { // added the required else block in the productDB class
                System.out.println("No product matches this product code.");
            } else {
                tagChar = Validator1.getChar("Do you want to add tags?(y): ");
                while (tagChar == 'y') {
                    p.setTags(Validator1.getString("Enter the tag: "));
                    tagChar = Validator1.getChar("Do you want to continue?(y): ");
                }
                productList.add(p);
                System.out.println("Product added to the array.");
            }

            ch = Validator1.getChar("Type 'y' to Continue:"); // written a new function for getting characters
        } while (ch == 'y');

        // printing the elements from the array
        System.out.println("-------------------------------------");
        int count = Product.getCount();
        System.out.println("The product count is: " + count);
        System.out.println("Details of all the added products: \n");
        for (Product element : productList) {
            System.out.println(element + "\n");
        }

        System.out.println("\n------Sorting based on price------");
        Collections.sort(productList, Product.getPriceComparator());
        for (Product element : productList) {
            System.out.println(element + "\n");
        }

        System.out.println("\n------Sorting based on code------");
        Collections.sort(productList, Product.getCodeComparator());
        for (Product element : productList) {
            System.out.println(element + "\n");
        }

        System.out.println("------Sorting based on price(descending)------");
        Collections.sort(productList, Product.getPriceComparatorDescending());
        for (Product element : productList) {
            System.out.println(element + "\n");
        }
        return;
    }
}
