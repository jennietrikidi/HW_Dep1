public class NewItem {
    private Item product = new Item();
    private int bonus;
    private int N;
    public NewItem(Item product, int bonus){
        this.product=product;
        this.bonus=bonus;
    }

    public Item getProduct() {
        return product;
    }

    public void setN(int n) {
        N = n;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public double cost(int N){
        this.N=N;
        if (N > 100) {
            double cost = N * this.product.getPrice()*bonus/100;
            return cost;
        }else{
            return N*this.product.getPrice();
        }
    }

    @Override
    public String toString() {
        return "NewItem:" +"\n"+
                "product:" + product +"\n"+
                "bonus: " + bonus;
    }
}