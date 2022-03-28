package homework08;

import java.util.Scanner;

public class pro2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Max Init: " + max);
        System.out.println("Min Init: " + min);
        while (true) {
            System.out.println("Enter a number : ");
            boolean isAnInt = scr.hasNextInt();//validating synyax for integer number
            if (isAnInt) {
                int number = scr.nextInt();//store a valid number
                if (number > max) {//if number is bigger than last max number than is store in max variable
                    max = number;
                    System.out.println("If Max true : " + max);
                }
                if (number < min) { //if number is smaller than last min number than store in min number
                    min = number;
                    System.out.println("If Min true :" + min);
                }
            } else {
                System.out.println("Invalid number :");
                break;
            }
            scr.nextLine();
        }
        System.out.println("Maximum : =" + max + "and Minimum : " + min);
        scr.close();
    }
}

