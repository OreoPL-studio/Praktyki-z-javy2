package zadania3petlewstep;
import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int liczby;

        do{
            System.out.println("Podaj liczby z przedziału od 10 do 24: ");
            liczby = keyboard.nextInt();
        }while(!(liczby >= 10 && liczby <= 24));
    }
}
