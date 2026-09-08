public class MultiDimensional_array {
    public static void main(String []args){
        System.out.println("MultiDimensional aray");
        System.out.println("2 dim array");
        int [][] TwoDArray;
        TwoDArray = new int[2][3];
        TwoDArray[0][0] = 101;
        TwoDArray[0][1] = 102;
        TwoDArray[0][2] = 103;

        TwoDArray[1][0] = 201;
        TwoDArray[1][1] = 202;
        TwoDArray[1][2] = 203;

        for(int i=0; i<TwoDArray.length;i++) {
            for (int j = 0; j < TwoDArray[i].length; j++) {
                System.out.print(TwoDArray[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
