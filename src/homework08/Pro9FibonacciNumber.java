/*9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/
package homework08;

import java.util.Scanner;

public class Pro9FibonacciNumber {
    public static void tim() {
        Scanner a = new Scanner(System.in);

        int first = 1;
        int second = 1;
        System.out.println("Fibonacci Series till :");
        int z = a.nextInt();
        System.out.println(z);

        for (int i = 1; i <= z; ++i)//number of times loop
        {
            System.out.print(first + ","); //print statement from 0
            //compute the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        //Pro9FibonacciNumber obj = new Pro9FibonacciNumber();
        tim();
    }
}
