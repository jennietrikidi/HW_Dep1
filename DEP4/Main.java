import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        Check []checkArr = new Check[3];
        Check checkPtr = new Check();
        String chNumber=null;
        String bName=null;
        int department=0;
        double amount=0;
        for (int i=0;i< checkArr.length;i++){
            checkArr[i]=createCheck(chNumber,bName,department,amount);
        }
        System.out.println("Enter a check pointer:");
        checkPtr=createCheck(chNumber,bName,department,amount);
        Search(checkPtr,checkArr);
    }


    public static Check createCheck( String chNumber, String bName, int department, double amount){
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        chNumber= input.nextLine();
        bName= input.nextLine();
        department=scanner.nextInt();
        amount=scanner.nextDouble();
        Check aCheck= new Check(chNumber,bName,department,amount);

        return aCheck;
    }
    public static void Search(Check checkPtr, Check[]checkArr){
        boolean checkExist = false;
        for(int i=0; i< checkArr.length;i++){
            if(checkArr[i].getChNumber().equals(checkPtr.getChNumber())){
                System.out.println(checkPtr.toString());
                checkExist = true;
                break;
            }
        }if(checkExist==false){
            System.out.println("The check does not exist.");
        }
    }
}



