import java.sql.SQLOutput;
import java.util.Scanner;
public class prog {
    public static void main(String[] args){
        System.out.println("calculator for adding 2 nums");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        float n1 = sc.nextFloat();
        System.out.println("Enter Number 2: ");
        float n2 = sc.nextFloat();
        float c = n1+n2;
        System.out.println("Sum of " + n1 + " and " + n2 + "is " + c);
    }
}
