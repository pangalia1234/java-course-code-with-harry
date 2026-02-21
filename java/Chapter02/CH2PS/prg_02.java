package Chapter02.CH2PS;
import java.util.Scanner;
public class prg_02 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = a+8;
       int c = b-8;
        System.out.println("original grade");
        System.out.println(a);
        System.out.println("encrypted grade");
        System.out.println(b);
        System.out.println("decrypted grade");
        System.out.println(c);
    }
}
