public class arrrayss {
    public static void main(String []args){
        //3 ways to declare
        int[] marks;
        marks = new int[5];

        int [] marks2 = new int[5];

        int[] marks3 = {1,2,3,4,5};

        //adding data
        int[] data = {25,30,35,40,45,50};
        System.out.println(data[5]);

        //for each loops in array
        System.out.println("For Each loops");
        int[] test = {10,20,30,40};
        System.out.println(test.length);

        System.out.println("STring array- ");
        String[] subsjects = {"English","Maths","hindi","CS"};
        System.out.println(subsjects[2]);

        //displaying array using for loops-
        System.out.println("Printing using For loops - ");
        for(int i =0; i<subsjects.length;i++){
            System.out.println(subsjects[i]);
        }

        System.out.println("Printing in reverse Order");
        for(int i=subsjects.length-1; i>=0;  i--){
            System.out.println(subsjects[i]);
        }






    }
}
