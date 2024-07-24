import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            strings.add(input);
        }

        System.out.println("The total amount of items in the list was: " + strings.size());
    }
}
