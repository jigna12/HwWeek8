package homework08;

import java.util.Scanner;

public class Pro12PrimeNumbers {
    public static void primenum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if (checkPrime(n)) {
            System.out.println(n + " Is a prime number");
        } else {
            System.out.println(n + " Is not a prime number");
        }
    }
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        primenum();
    }
}
