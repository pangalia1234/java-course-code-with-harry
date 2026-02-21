package Chapter01;

import java.util.Scanner;
public class cwh_05_TakingInpu {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);

        System.out.println("addition of two integers");
        System.out.println("enter int 1");
        int a = sc.nextInt();
        System.out.println("enter int 2");
        int b = sc.nextInt();
        int sum1 = a+b;
        System.out.println("sum of these int is");
        System.out.println(sum1);

        System.out.println("addition of two float");
        System.out.println("enter float 1");
        float c = sc.nextFloat();
        System.out.println("enter float 2");
        float d = sc.nextFloat();
        float sum2 = c+d;
        System.out.println("sum of these float is");
        System.out.println(sum2);


        //was not able to run them buut u know the function
        //boolean b1 = sc.hasNextInt();    //only check if next inp is int or not got stuck as we have no int value next so str did not ran
       // System.out.println(b1);
        String str = sc.next();
        System.out.println(str);

        sc.nextLine();   // clear buffer float upar h uski wajah se
        System.out.println("enter a line");
       String str2 = sc.nextLine();
        System.out.println(str2);


    }
}
