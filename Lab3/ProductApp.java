public class ProductApp {
    public static void main(String args[]){
        char ch='y'; int index=0;
        //array of products
        Product createdProducts[]= new Product[10];
        
        do{
            Product p = ProductDB.getProduct(Validator1.getString("Type the product code:"));
            if(p==null){  //added the required else block in the productDB class
                System.out.println("No product matches this product code.");   
            }else{
                createdProducts[index]=p;
                index++;
                System.out.println("Product added to the array.");
            }
            
            System.out.println("Type 'y' to Continue:");
            ch = Validator1.getChar();   //written a new function for getting characters 
        }while(ch == 'y');

        //printing the elements from the array
        int i=0;
        System.out.println("-------------------------------------");
        int count=Product.getCount();
        System.out.println("The product count is: "+count);
        System.out.println("Details of all the added products: \n");
        while(i < count){
            System.out.println(createdProducts[i].toString()+"\n");
            i++;
        }
    }
}
            
            