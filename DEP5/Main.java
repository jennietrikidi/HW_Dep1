import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Film[] filmArr = new Film[15];
        String name = "NA";
        String director = "NA";
        int copies = 0;
        for (int i = 0; i < filmArr.length; i++) {
            filmArr[i] = createFilm(name, director, copies);
        }
        for (int i = 0; i < filmArr.length; i++) {
            int j = i + 1;
            System.out.println(j + "." + filmArr[i]);
        }
        System.out.println("Choose the movie you return a copie:");
        int N = scanner.nextInt();
        System.out.println(filmArr[N-1].insert());
        System.out.println("Choose the movie you take a copie:");
        int M=scanner.nextInt();
        if(filmArr[M-1].check()==false){
            System.out.println("there are no copies of this movie.");
        }else{
            filmArr[M-1].remove();
            for (int k =0;k<filmArr.length;k++){
                System.out.println(filmArr[k].toString());
            }}
    }

    public static Film createFilm(String name, String director, int copies){
        Scanner scanner = new Scanner(System.in);
        name=scanner.nextLine();
        director=scanner.nextLine();
        copies=scanner.nextInt();
        Film film = new Film(name,director,copies);
        return film;
    }
}



