package Chapter02.CH2PS;
import java.util.Scanner;

public class prg_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("initial velocity");
        float u = sc.nextFloat();
        System.out.println("velocity");
        float v = sc.nextFloat();
        System.out.println("acceleration");
        float a = sc.nextFloat();
        System.out.println("displacement");
        float s = sc.nextFloat();
        System.out.println("calculate the following expression");
        float x = ((v*v)-(u*u))/(2*a*s);
        System.out.println(x);

    }
}
