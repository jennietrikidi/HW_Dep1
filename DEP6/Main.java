import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int code;
        String group;
        String manufact;
        int year;
        System.out.println("Enter toys data: ");
        Toy[] toysArray = new Toy[3];
        for (int i = 0; i < toysArray.length; i++) {
            code = input.nextInt();
            group= scanner.nextLine();
            manufact = scanner.nextLine();
            year = input.nextInt();
            toysArray[i]=new Toy(code,group,manufact,year);
        }
        System.out.println("Enter the kid's age: ");
        year= input.nextInt();
        System.out.println("The games they can play are: ");
        for(int j=0;j< toysArray.length;j++){
            if(year>=toysArray[j].getYear()){
                System.out.println(toysArray[j].toString());
            }
        }
    }
}



