import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        int num, sum = 0, firstdigit, lastdigt;
        Scanner scanner = new Scanner(System.in); // input a number from user
        System.out.println("Enter any number to find sum of first and last digit : ");
        num = scanner.nextInt();
        lastdigt = num % 10;//find last digit to sum
        firstdigit = num;//copy num to first digit
        while (num >= 10) { // find the first digit by dividing num by 10 until first digit is left
            num = num / 10;
        }
        firstdigit = num;// find sum of first and last digit
        sum = firstdigit+lastdigt;
        System.out.println("sum of first and last = " + sum );
    }
}