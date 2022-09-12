package zadania3petlewstep;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char litery;

        do{
            System.out.println("Podaj litery (T,t,N lub n)");
            litery = keyboard.nextLine().toUpperCase().charAt(0);
        }while(!(litery == 'n' || litery == 'N' || litery == 'T' || litery == 't'));
    }
}
