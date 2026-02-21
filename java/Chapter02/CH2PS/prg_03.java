package Chapter02.CH2PS;
import java.util.Scanner;
public class prg_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 50;
        int b = sc.nextInt();
        System.out.println("given number");
        System.out.println(a);
        System.out.println("user entered number");
        System.out.println(b);
        System.out.println("given number is greater than the user entered number or not ");
        System.out.println(a>b);
    }
}
