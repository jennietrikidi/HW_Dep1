public class Check {
    private String chNumber;
    private String bName;
    private int department;
    private double amount;
    public Check(String chNumber,String bName, int department, double amount){
        this.chNumber=chNumber;
        this.bName=bName;
        this.department=department;
        this.amount=amount;
    }
    public Check(){
        this.chNumber="UNKNOWN";
        this.bName="UNKNOWN";
        this.department=0;
        this.amount=0;
    }
    public void setData(String chNumber,String bName, int department, double amount){
        this.chNumber=chNumber;
        this.bName=bName;
        this.department=department;
        this.amount=amount;
    }
    public String getChNumber() {
        return chNumber;
    }

    public String getbName() {
        return bName;
    }

    public int getDepartment() {
        return department;
    }

    public double getAmount() {
        return amount;
    }
    public String toString(){
        return "Bank: "+ bName +"\n"+"check number: "+chNumber+"\n"+"department: "+department+"\n"+
                "the amount is: "+amount;
    }
}