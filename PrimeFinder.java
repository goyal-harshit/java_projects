import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFinder {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true; // 2 is the only even prime number
        if (number % 2 == 0) return false; // eliminate even numbers

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Function to find all prime numbers between 1 and a given number
    public static List<Integer> findPrimes(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 1; i <= limit; ++i) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input value from the user
        System.out.print("Enter the upper limit to find prime numbers: ");
        int limit = scanner.nextInt();

        // Find all prime numbers up to the given limit
        List<Integer> primes = findPrimes(limit);

        // Print the prime numbers
        System.out.println("Prime numbers between 1 and " + limit + " are: " + primes);

        scanner.close();
    }
}
