package zadania3petlewstep;

public class Zadanie12 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i = 1, j = 30; i<=30; i++, j--){
           sum += (double)i/j;
        }
        System.out.println(sum);
    }
}
