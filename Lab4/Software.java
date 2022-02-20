public class Software extends Product{
    String version; 

    public Software(String _code, String _description, Double _price,String _version, String[] _tags){
        setCode(_code);
        setDescription(_description);
        setPrice(_price);
        setVersion(_version);
        setTags(_tags);
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
