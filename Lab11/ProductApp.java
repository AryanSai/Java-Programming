import java.util.Arrays;
public class ProductApp{
    public static void main(String args[]){
        char ch='y',tagChar; int index=0;
        //array of products
        Product createdProducts[]= new Product[10];
        
        do{
            Product p = ProductDB.getProduct(Validator1.getString("Type the product code:"));
            if(p==null){  //added the required else block in the productDB class
                System.out.println("No product matches this product code.");   
            }else{
                tagChar = Validator1.getChar("Do you want to add tags?(y): ");
                while(tagChar == 'y'){
                    p.setTags(Validator1.getString("Enter the tag: "));
                    tagChar = Validator1.getChar("Do you want to continue?(y): ");
                }
                createdProducts[index]=p;
                index++;
                System.out.println("Product added to the array.");
            }
            Arrays.sort(createdProducts,0,index);
            
            ch = Validator1.getChar("Type 'y' to Continue:");   //written a new function for getting characters 
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
            
            