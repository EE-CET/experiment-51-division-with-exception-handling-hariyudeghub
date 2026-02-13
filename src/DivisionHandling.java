import java.util.Scanner;

public class DivisionHandling {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        try{
                int result= a/b;
                System.out.print(result);
        }
        catch(ArithmeticException e){
                System.out.println("Divide by zero error");
        }
        }
}
