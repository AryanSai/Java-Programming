public class ProductDB{
    public static Product getProduct(String productCode){
        
        Product p = null;
        if (productCode.equalsIgnoreCase("java")){
            String tags[]={"java","Beginners","programming"};
            Book b = new Book("java", "Murach's Beginning Java 2", 49.50, "Andrea Steelman",tags);
            p = b;
        }
        else if (productCode.equalsIgnoreCase("jsps")){
            String tags[]={"jsps","web programming"};
            Book b = new Book("jsps","Murach's Java Servlets and JSP",49.50,"Andrea Steelman",tags);
            p = b;
        }
        else if (productCode.equalsIgnoreCase("mcb2")){
            String tags[]={"basic cobol","cobol"};
            Book b = new Book("mcb2","Murach's Mainframe COBOL",59.50,"Mike Murach",tags);
            p = b;
        }
        else if (productCode.equalsIgnoreCase("txtpd")){
            String tags[]={"text editor","editor"};
            Software s = new Software("txtp","TextPad",27.00,"4.7.3",tags);
            p = s; 
        }
        else if (productCode.equalsIgnoreCase("wrdpd")){
            String tags[]={"word","word processing"};
			Software s = new Software("wrdpd","Word Pad",37.00,"6.3.3",tags);
			p = s; // set Product object equal to the Software object
        }
        else{
            return null;
        }
        return p;
    }
}