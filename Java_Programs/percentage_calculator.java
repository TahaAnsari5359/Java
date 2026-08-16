import java.util.Scanner;
public class percentage_cal {
    public static void main(String[] args){
        System.out.println("PERCENTAGE CALCULATOR");
        Scanner sc = new Scanner(System.in);
        System.out.println("English: ");
        float m1 = sc.nextFloat();
        System.out.println("Science: ");
        float m2 = sc.nextFloat();
        System.out.println("Maths: ");
        float m3 = sc.nextFloat();
        System.out.println("Chemistry: ");
        float m4 = sc.nextFloat();
        System.out.println("Physics: ");
        float m5 = sc.nextFloat();


        float marks_obt = m1+m2+m3+m4+m5;
        float form = (marks_obt/500) * 100;
        float cgpa = (form/9.5f);

        System.out.println("Total Marks Obtained: "+ marks_obt);
        System.out.println("Percentage: "+ form+"%");
        System.out.println("CGPA: "+ cgpa);


    }
}
