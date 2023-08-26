public class Main {
    public static void main(String[] args) {
        int age1 = 20;
        int age2 = 17;
        String name1 = "Kapil";
        String name2 = "Unknown";

        // Logical AND
        if(age1 == 20 && name1 == "Kapil"){
            System.out.println("Valid user - name: " + name1);
        } else {
            System.out.println("Invalid user!");
        }

        // Logical OR
        if(age1 == 17 || name1 == "Kapil"){
            System.out.println("Valid user - name: " + name1);
        } else {
            System.out.println("Invalid user!");
        }

        // Logical NOT
        if(age2 != 20){
            System.out.println("Invalid User!");
        } else {
            System.out.println("Valid user again");
        }
    }
}