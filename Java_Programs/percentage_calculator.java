import java.util.Scanner;
public class percentage_cal {
    public static void main(String[] args){
        System.out.println("PERCENTAGE CALCULATOR");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks 1: ");
        float m1 = sc.nextFloat();
        System.out.println("Enter Marks 2: ");
        float m2 = sc.nextFloat();
        System.out.println("Enter Marks 3: ");
        float m3 = sc.nextFloat();
        System.out.println("Enter Marks 4: ");
        float m4 = sc.nextFloat();
        System.out.println("Enter Marks 5: ");
        float m5 = sc.nextFloat();

        float marks_obt = m1+m2+m3+m4+m5;
        float form = (marks_obt/500) * 100;
        System.out.println("Total Marks Obtained: "+ marks_obt);
        System.out.println("Percentage: "+ form+"%");


    }
}
