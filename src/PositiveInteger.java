import java.util.Scanner;

public class PositiveInteger {
    public  static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter positive number ;");
        int n = scanner.nextInt();
        for (int i = 1;i <=10;i++){

            if( n > 0){
                System.out.println( n + "*"+i+"="+ (n * i));
            }
        }

    }

}
