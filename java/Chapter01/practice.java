package Chapter01;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("marksheet");
        Scanner sc = new Scanner(System.in);
        System.out.println("maths");
        float a = sc.nextFloat();
        System.out.println("Physics");
        float b = sc.nextFloat();
        System.out.println("history");
        float c = sc.nextFloat();
        System.out.println("eng");
        float d = sc.nextFloat();
        System.out.println("hindi");
        float e = sc.nextFloat();
        float percent = (((a+b+c+d+e)/500)*100);
        System.out.println("percentage");
        System.out.println(percent);
        //correct code gpt


    }
}
