import java.text.NumberFormat;
import java.util.Comparator;

interface Tagable {
    void setTags(String tags);
    String getTags();
}

public class Product implements Comparable<Product>, Tagable {
    private String code;
    private String description;
    private double price;
    private String tags = null;
    public static int count = 0;

    public int compareTo(Product p) {
        return (this.code).compareTo(p.code);
    }

    public void setTags(String _tags) {
        if (this.tags == null) {
            this.tags = _tags;
        } else {
            this.tags = this.tags + "," + _tags;
        }
    }

    public String getTags() {
        return this.tags;
    }

    public Product(String _code, String _description, Double _price) {
        setCode(_code);
        setDescription(_description);
        setPrice(_price);
    }

    public Product() {
        this("", "", 0.0);
        count++; // increments whwenever constructor is called
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getFormattedPrice() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString() {
        return "Code:         " + code + "\n" +
                "Description: " + description + "\n" +
                "Price:       " + this.getFormattedPrice() + "\n" +
                "Tags:        " + tags + "\n";
    }

    public static int getCount() {
        return count;
    }

    public static Comparator<Product> getPriceComparator() {
        return new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                double diff = p1.price - p2.price;
                if (diff < 0)
                    return -1;
                else if (diff > 0)
                    return 1;
                else
                    return 0;
            }
        };
    }

    public static class InnerClass implements Comparator<Product> {
        public int compare(Product p1, Product p2) {
            return (p1.code).compareTo(p2.code);
        }
    }

    public static Comparator<Product> getCodeComparator() {
        return new InnerClass();
    }

    public static Comparator<Product> getPriceComparatorDescending() {
        class LocalInnerClass implements Comparator<Product> {
            public int compare(Product p1, Product p2) {
                double diff = p2.price - p1.price;
                if (diff < 0)
                    return -1;
                else if (diff > 0)
                    return 1;
                else
                    return 0;
            }
        }
        LocalInnerClass ic = new LocalInnerClass();
        return ic;
    }
}