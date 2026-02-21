package Chapter01.CH1PS;
import java.util.Scanner;
public class prg_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Maths");
        float a = sc.nextFloat();
        System.out.println("hindi");
        float b = sc.nextFloat();
        System.out.println("science");
        float c = sc.nextFloat();
        float total_marks = a+b+c;
        System.out.println("CGPA");
        float CGPA = (total_marks/300)*100;
        System.out.println(CGPA);

    }
}
