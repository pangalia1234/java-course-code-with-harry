package chapter_04;
import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("you are an adult");
                break;
            case 21:
                    System.out.println("you are joining a company");
break;
case 68:
    System.out.println("retire");
break;
default:
    System.out.println("enjoy ");
}
}
}