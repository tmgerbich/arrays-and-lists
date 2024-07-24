import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number == 0) {
                    break;
                }
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Please enter a number.");
            }
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        for (int i = 0; i < numbers.size()-1; i++) {
            System.out.print(numbers.get(i) + ", ");
        }
        System.out.print("and " + numbers.get(numbers.size()-1) + " were the items in the list. The sum of that list is:");
        System.out.println();
        System.out.println(sum);
    }
}

