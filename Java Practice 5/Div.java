import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Div {
    // This method takes an integer 'n' as input and returns a list of its divisors.
    public static List<Integer> findDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Call the findDivisors method to get the list of divisors.
        List<Integer> divisors = findDivisors(number);

        System.out.print("The divisors of " + number + " are: ");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }
}
