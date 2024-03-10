import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Item []item =new Item[2];
        NewItem []newItems=new NewItem[1];
        long catalog=0;
        String name=null;
        float price=0;
        int bonus=0;
        Item product = new Item();
        System.out.println("Enter products:");
        for(int i=0;i< item.length;i++) {
            item[i] = creatingItem(catalog, name, price);
        }
        for(int k=0;k< newItems.length;k++) {
            newItems[k]=creatingNewItems(bonus,product,catalog,name,price);
        }
        System.out.println("Enter the name of the product you wanna buy:");
        name= scanner.nextLine();
        System.out.println("how much do you wanna buy: ");
        int N= input.nextInt();
        for(int j=0;j<item.length;j++){
            if(name.equals(item[j].getName())){
                System.out.println(item[j].toString()+"\n"+ item[j].cost(N));
            }else if(name.equals(newItems[j].getProduct().getName())) {
                System.out.println(newItems[j].toString()+"\n"+newItems[j].cost(N));
            }
        }
    }
    public static Item creatingItem(long catalog, String name, float price){
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner longScanner = new Scanner(System.in);
        name= scanner.nextLine();
        catalog=longScanner.nextLong();
        price=input.nextFloat();
        Item item = new Item(catalog,name,price);
        return  item;
    }
    public static NewItem creatingNewItems(int bonus, Item product,long catalog, String name, float price){
        Scanner input = new Scanner(System.in);
        product= creatingItem(catalog,name,price);
        bonus= input.nextInt();
        NewItem newItem =new NewItem(product,bonus);
        return newItem;
    }
}
}



