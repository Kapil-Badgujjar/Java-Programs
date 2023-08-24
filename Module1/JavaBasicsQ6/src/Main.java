import java.util.Scanner;

public class Main {
    // Declaring method/function to print name
    public static void printMyName(String name){
        System.out.println("Your name is: "+name);
    }

    // Our main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Calling printMyName method/function
        printMyName(name);
    }
}