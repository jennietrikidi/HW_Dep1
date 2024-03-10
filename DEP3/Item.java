public class Item {
    private long catalog;
    private String name;
    private float price;
    private int N;
    public long getCatalog() {
        return catalog;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getN() {
        return N;
    }

    public void setCatalog(long catalog) {
        this.catalog = catalog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setN(int n) {
        N = n;
    }
    public double cost(int N){
        return N*this.price;
    }
    public Item(long catalog, String name, float price){
        this.catalog =catalog;
        this.name = name;
        this.price = price;
    }
    public Item(){
        catalog=0;
        name="NA";
        price=0;
    }
    public String toString(){
        return "Catalog number:" +catalog+ "\n" + "Item:"+name + "\nprice:"+price;
    }
}
