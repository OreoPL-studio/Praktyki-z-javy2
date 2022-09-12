package zadania7;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj prędkość: ");
        int predkosc = keyboard.nextInt();

        System.out.println("Podaj ilość godzin: ");
        int godziny = keyboard.nextInt();

        for(int i = 1 ; i<=godziny; i++){
            System.out.println(i);
            System.out.println(predkosc * i);
        }
    }
}