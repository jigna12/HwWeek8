
package homework08;
import java.util.Scanner;
public class Pro1ReadingUserInputChallenge {
    public static void tim(){
        int i = 1;
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter the number :");

        while (i <= 10)
            sum += obj.nextInt();
        if (obj.hasNextInt()) {
            i++;
        }
        System.out.println("The total sum is : " + sum);
        System.out.println("Invalid Number");
        obj.close();
    }

    public static void main(String[] args) {
        tim();
    }
}