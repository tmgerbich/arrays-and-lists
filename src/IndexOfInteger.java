import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {

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

        System.out.println("Done entering integers into the list");
        System.out.println("What number are you looking for in the list?");
        String input = scanner.nextLine();
        try{
            int num = Integer.parseInt(input);
                if (numbers.contains(num)) {
                    System.out.println("" + num + " is at index " + numbers.indexOf(num));
                }
            } catch(NumberFormatException e){
                    System.out.println("You did not enter a number in the list");
                }
            }
    }

