import java.util.Scanner;

public class factorialValue {
    public static void main(String[] args){
        int num;
        int fact;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("please enter any number ");
        num = scanner.nextInt();
        fact = 1;
        for ( int i =num; i >= 1; i--)
        {
            fact=fact*i;

        }
        System.out.println( "Factorial of "+ num + "is" + fact);
    }
}
