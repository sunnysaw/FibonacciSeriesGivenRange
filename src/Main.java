/*
Question : Write a program to print fibonacci series by given range.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first,second,ending,sum;
        System.out.println("Enter the first digit :");
        first = sc.nextInt();
        System.out.println("Enter the second digit :");
        second = sc.nextInt();
        System.out.println("Enter the last digit :");
        ending = sc.nextInt();
        System.out.println("Printing the result :");
        for (int i = 1; i <= ending; i++){
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }
    }
}