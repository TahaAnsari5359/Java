
import java.util.Scanner;

public class taking_input {
    public static void main(String[] args){
        System.out.println("Taking Input From User: ");
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = num.nextInt();
        System.out.println("The Number is " + a);

    }
}
