package Chapter02;

public class Cwh_09 {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        int b = 60/5-34*2;
        System.out.println(a);
        System.out.println(b);
        // Precedence & associativity
        int c = 1;
        int k=b*b - (4*a*c)/(2*a);
        System.out.println(k);
        int l = b*b-4*a*c/2*a;
        System.out.println(l);


    }
}
