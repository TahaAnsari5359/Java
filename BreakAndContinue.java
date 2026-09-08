public class breakk_and_continueee {

    public static void main(String []args) {
        System.out.println("Break Statement:-");
        for(int i = 0; i<=20; i++){
            System.out.println(i);
            if (i==5){
                break;
            }
        }

        System.out.println("Continue Statement");
        for(int j = 1; j<=20; j++){

            if (j==5){
                System.out.println("Ending loop");
                continue;


            }
            System.out.println(j);
        }

    }


}
