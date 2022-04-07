package main.products;
public class Software extends Product{
    String version; 

    public Software(String _code, String _description, Double _price,String _version){
        setCode(_code);
        setDescription(_description);
        setPrice(_price);
        setVersion(_version);
    }

    public void setVersion(String _version){
        version=_version;
    }

    public String getVersion(){
        return version;
    }

    public String toString(){
        return super.toString() + "Version: " + version;
    }
}
