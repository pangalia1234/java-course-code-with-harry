package Chapter01.CH1PS;
import java.util.Scanner;
public class prg_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you name:");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("hello " + str + " have a good day");
    }
}
