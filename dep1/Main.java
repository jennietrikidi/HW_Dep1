import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String name;
        String city;
        int rooms;
        int free;
        Hotel[] hotelsArr = new Hotel[30];
        for (int i = 0; i < hotelsArr.length; i++) {
            name = input.nextLine();
            city = input.nextLine();
            rooms = scanner.nextInt();
            free = scanner.nextInt();
            hotelsArr[i] = new Hotel(name, city, rooms, free);
            if(hotelsArr[i].getFree()>hotelsArr[i].getRooms()*0.4){  //שאלת בונוס
                System.out.println(hotelsArr[i].toString());
            }
        }
        System.out.println("Enter the hotel's name: ");
        String anotherName = input.nextLine();
        for (int i = 0; i < hotelsArr.length; i++) {
            if(hotelsArr[i].getName().equals(anotherName)){
            System.out.println(hotelsArr[i].toString());
            break;
        }}
    }
    }








