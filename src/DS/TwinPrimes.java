package DS;

public class TwinPrimes {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void findTwinPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && isPrime(i - 2)) {
                System.out.println("(" + (i - 2) + ", " + i + ")");
            }
        }
    }

    public static void main(String[] args) {
        int n = 31; // You can change this value to find twin primes up to a different range.
        System.out.println("Twin prime pairs up to " + n + ":");
        findTwinPrimes(n);
    }
}
