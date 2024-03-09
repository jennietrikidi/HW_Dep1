public class Shop {
    private String name;
    private double banana;
    private double apple;
    private double orange;
    private double sum;
    public Shop(){
        this.name =null;
        this.banana=0.0;
        this.apple=0.0;
        this.orange=0.0;
    }
    public Shop(String name, double banana, double apple, double orange){
        this.name=name;
        this.banana=banana;
        this.apple=apple;
        this.orange=orange;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setData(String name, double banana, double apple, double orange){
        this.name=name;
        this.banana=banana;
        this.apple=apple;
        this.orange=orange;
    }
    public String getName() {
        return name;
    }

    public double getBanana() {
        return banana;
    }

    public double getApple() {
        return apple;
    }

    public double getOrange() {
        return orange;
    }
    public double sumToPay(double bananaKg,double appleKg,double orangeKg){
        return this.sum=bananaKg*this.banana+appleKg*this.apple+orangeKg*this.orange;
    }
    @Override
    public String toString() {
        return "The Shop name: " + name + "\n" +"price per kilo: "+"\n"+
                "banana: " + banana +"\n"+
                "apple: " + apple +"\n"+
                "orange: " + orange;
    }
}
