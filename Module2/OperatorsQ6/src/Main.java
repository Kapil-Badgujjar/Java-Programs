import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a numbers: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Using Relational operators
        if(num > 200){
            System.out.println("Number is greater then 200");
        }

        if(num < 200) {
            System.out.println("Number is less then 200");
        }

        if(num <= 100){
            System.out.println("Number is less than or equal to 100");
        }

        if(num >= 500) {
            System.out.println("Number is greater than or equal to 500");
        }
    }
}