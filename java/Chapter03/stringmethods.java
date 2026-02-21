package Chapter03;

public class stringmethods {
    public static void main(String[] args) {
        String name = "Harry";
        int value = name.length();
        System.out.println(name);
        System.out.println(value);
        String lstr = name.toLowerCase();
        System.out.println(lstr);
        String ustr = name.toUpperCase();
        System.out.println(ustr);
        String nontrim = "    harry    ";
        System.out.println(nontrim);
        System.out.println(nontrim.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry","ier"));
        System.out.println(name.replace("r","ier"));
        System.out.println(name.startsWith("h"));
        System.out.println(name.startsWith("H"));
        System.out.println(name.endsWith("ha"));
        System.out.println(name.endsWith("y"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("ry"));
        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("ry",4));
        System.out.println(modifiedName.lastIndexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("rry",4));
        System.out.println(name.equals("harry"));
        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HaRRy"));
        System.out.println("i am escape \t sequence \" double \n quote\\");





    }
}
