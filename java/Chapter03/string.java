package Chapter03;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String name = new String("pavi");
        System.out.print("the name is:");
        System.out.println(name);
        String name2 ="harry";
        System.out.println("the name2 is:");
        System.out.println(name2);
        int a = 6;
        float b = 5.45f;
        System.out.printf("the value of a is %d and b is %f",a,b);
        System.out.format("the value of a is %d and b is %f",a,b); // printf=format are same
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);

    }
}
