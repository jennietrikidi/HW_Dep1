import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String name=null;
        double banana=0;
        double apple=0;
        double orange=0;
        cheapest(name,banana,apple,orange);
    }
    public static void cheapest(String name, double banana, double apple, double orange) {
        Shop[] shop = new Shop[12];
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        boolean isSmallest = false;
        for (int i = 0; i < shop.length; i++) {
            name = input.nextLine();
            banana = scanner.nextDouble();
            apple = scanner.nextDouble();
            orange = scanner.nextDouble();
            shop[i] = new Shop(name, banana, apple, orange);
        }
        String cheapestShop = null;
        double cheapestSum = 0.0;
        System.out.println("how much do you want to buy: ");
        double bananaKg = scanner.nextDouble();
        double appleKg = scanner.nextDouble();
        double orangeKg = scanner.nextDouble();
        for (int k = 0; k < shop.length; k++) {
            for (int j =k+1; j < shop.length; j++) {
                if (shop[k].sumToPay(bananaKg, appleKg, orangeKg) <= shop[j].sumToPay(bananaKg, appleKg, orangeKg)) {
                    cheapestShop = shop[k].getName();
                    cheapestSum = shop[k].sumToPay(bananaKg, appleKg, orangeKg);
                    isSmallest=true;
                }
            }
            if(isSmallest==true){
                break;
            }
        }
        System.out.println("The cheapest shop is: " + cheapestShop + "\n" + "The sum of you're list is: " + cheapestSum);
    }
}








