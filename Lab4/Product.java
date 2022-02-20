import java.text.NumberFormat;

interface Tagable{
    void setTags(String[] tags);
    String[] getTags();
}

public class Product implements Comparable<Product>,Tagable{
    private String code;
    private String description;
    private double price;
    private String[] tags;
    public static int count = 0;

    public int compareTo(Product p){
        return (this.code).compareTo(p.code);
    }

    public void setTags(String[] _tags){
        this.tags=_tags;
    }

    public String[] getTags(){
        return tags;
    }

    public Product(String _code, String _description, Double _price, String[] _tags){
        setCode(_code);
        setDescription(_description);
        setPrice(_price);
        setTags(_tags);
    }

    public Product(){
        this("","",0.0,new String[0]);
        count++; //increments whwenever constructor is called
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getFormattedPrice(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString(){
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " + this.getFormattedPrice() + "\n";
    }

    public static int getCount(){
        return count;
    }
}