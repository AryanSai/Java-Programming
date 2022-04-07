package main.invoice;

public class Invoice {
    int invoiceNumber = 1;
    int total;

    public Invoice(){

    }
    public String toString(){
        return "Invoice Number: " +  "\n" +
               "Date: "  + "\n" +
               "Products: " +  "\n" +
               "Total: " + "\n";
    }
}
