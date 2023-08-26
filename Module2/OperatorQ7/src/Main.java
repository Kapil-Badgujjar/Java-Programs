import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if(num1 < num2){
            System.out.println("Smaller number is: "+num1);
            System.out.println("Larger number is: "+num2);
        } else if( num1 == num2 ){
            System.out.println("Both are same");
        } else {
            System.out.println("Smaller number is: "+num2);
            System.out.println("Larger number is: "+num1);
        }
    }
}