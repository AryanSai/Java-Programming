public class ProductApp {
    public static void main(String args[]){
        char ch='y';
        int count;
        do{
            Product p = ProductDB.getProduct(Validator1.getString("Type the product code:"));
            if(p==null){  //added the required else block in the productDB class
                System.out.println("No product matches this product code.");   
            }else{
                System.out.println(p.toString());
            }

            count=Product.getCount();
            System.out.println("The product count is:"+count);
            System.out.println("Continue(y):");
            ch = Validator1.getChar();   //written a new function for getting characters        
        }while(ch == 'y');
    }
}
