import java.util.Scanner;
public class km_to_mile_conversion {
    public static void main(String[] args){
        System.out.println("Kile Meter to Miles Conversion");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter KM: ");
        int km = sc.nextInt();

        double km_to_mile_form = (km/1.609d);

        System.out.println("Miles: " + km_to_mile_form);
    }
}
