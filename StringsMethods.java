public class StringsInJava {
    public static void main(String[] args) {
        String name = "Taha";
        System.out.println(name);
        int len = name.length();
        System.out.println(len);


        String low_case = name.toLowerCase(); //Original String wont change we have to create new string
        System.out.println(low_case);


        String upr_case = name.toUpperCase();
        System.out.println(upr_case);


        String nonTrimmedString = "       Taha        ";
        System.out.println(nonTrimmedString.trim()); // Remove Spaces


        String SubStringVar = "TahaAnsari";
        System.out.println(SubStringVar.substring(4, 8)); //Start Index and End Index But End Index Would Not include


        String namess = "harry";
        //Replace all Character not only 1st occurence
        System.out.println(namess.replace('r', 'p')); // Replace Character r to p


        System.out.println(namess.startsWith("har")); // return True
        System.out.println(namess.endsWith("a")); //ending with y thts y return False

        System.out.println(namess.charAt(2));

        System.out.println(namess.indexOf("r")); //If elements Doest mattch it will return -1

        System.out.println(namess.lastIndexOf("r"));

        System.out.println(namess.equals("harry"));

        System.out.println(namess.equalsIgnoreCase("HARRY")); //Doesnt matter caps or small just need same char
    }

}
