import java.util.Scanner;

public class HomeTaskS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greetings = scanner.nextLine();
        int len = greetings.length();
        boolean numberOfCharacters = (len > 10);
        System.out.println(numberOfCharacters);


    }
}


