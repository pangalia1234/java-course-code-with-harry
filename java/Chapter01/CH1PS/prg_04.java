package Chapter01.CH1PS;
import java.util.Scanner;
public class prg_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("KILOMETER:");
        float k = sc.nextFloat();
        System.out.println("MILES");
        float Miles = (k/8)*5;
        System.out.println(Miles);
    }
}
