package Chapter03.CH3PS;

public class ps03 {
    public static void main(String[] args) {
        String letter = "dear <|name|>, thanks a lot!";
        letter = letter.replace("<|name|>","harry");
        System.out.println(letter);
    }
}
