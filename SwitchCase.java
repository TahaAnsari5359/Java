import java.util.Scanner;
public class switch_case {
    public static void main(String []args) {
        System.out.println("Switch Cases In Java: ");

        Scanner sc = new Scanner((System.in));
        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        switch(age){
            case 17:
                System.out.println("You cannot play gta 5 ");
                break;
            case 18:
                System.out.println("You are adult u can Play GTA 5 ");
                break;
            default:
                System.out.println("This Will Print When above 2 condi bcm False");

        }
    }
}
