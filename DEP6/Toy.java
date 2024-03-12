public class Toy {
    private int code;
    private String group;
    private String manufact;
    private int year;
    public Toy(int code, String group, String manufact,int year){
        this.code = code;
        this.group = group;
        this.manufact = manufact;
        this.year = year;
    }
    public Toy(){
        code=0;
        group="NA";
        manufact="NA";
        year=0;
    }
    public int getCode(){
        return code;}
    public String getGroup(){
        return group;}
    public String getManufact(){
        return manufact;}
    public int getYear() {
        return year;
    }
    public void set(int code, String group, String manufact,int year){
        this.code = code;
        this.group = group;
        this.manufact = manufact;
        this.year = year;
    }
    public String toString() {
        return "Code: "+code + "\n" +
                "Group: "+ group + "\n" +
                "Manufact: "+ manufact + "\n" +
                "Year: "+ year;
    }
}
