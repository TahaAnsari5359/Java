import java.util.Scanner;
public class sqrt_cube {
    public static void main(String []args) {
        System.out.println("Squaring and Cube Of Number");

        Scanner sc = new Scanner(System.in);
        System.out.println("Select 1 for Square root and 2 for cube root");
        int select = sc.nextInt();
        System.out.println("Enter Number: ");
        double n = sc.nextDouble();

        if (select ==1){
            double result = Math.sqrt(n);
            System.out.println("Square Root of "+ n + " = " + result);
        }

        if (select ==2){
            double result1 = Math.cbrt(n);
            System.out.println("Cube Root of " + n + " = " + result1);
        }


    }
}
