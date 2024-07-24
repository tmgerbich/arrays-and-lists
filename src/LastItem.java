import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {

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

        System.out.println("The last item in the list is: " + strings.get(strings.size() - 1));

    }
}
