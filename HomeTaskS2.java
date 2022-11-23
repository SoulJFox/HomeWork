import java.util.Scanner;

public class HomeTaskS2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbols = scanner.next();
        char first = symbols.charAt(0);
        int last = symbols.length();
        boolean comparison = (first == symbols.charAt(last -1));
        System.out.println(comparison);


    }
}
