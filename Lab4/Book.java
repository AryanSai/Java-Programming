public class Book extends Product{
    String author;

    public Book(String _code, String _description, Double _price,String _author, String[] _tags){
        setCode(_code);
        setDescription(_description);
        setPrice(_price);
        setAuthor(_author);
        setTags(_tags);
    }

    public void setAuthor(String _author){
        author=_author;
    }

    public String getAuthor(){
        return author;
    }

    public String toString(){
        return super.toString() + "Author:      " + author;
    }

}

