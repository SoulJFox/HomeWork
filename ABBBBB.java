import java.util.Scanner;

public class ABBBBB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.replace('a','c');
        word = word.replace('b','a');
        word = word.replace('c','b');


        System.out.println(word);
    }
}
