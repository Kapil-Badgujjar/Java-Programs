public class Main {
    // Method for sum (+) operator
    public static int sum(int a,int b){
        return a+b;
    }
    // Method for minus (-) operator
    public static int difference(int a,int b){
        return a-b;
    }
    // Method for multiply (*) operator
    public static int multiply(int a,int b){
        return a*b;
    }
    // Method for division (/) operator
    public static int division(int a,int b){
        return a/b;
    }


    // Main method
    public static void main(String[] args) {
        int x = 200;
        int y = 100;

        // Calling function with values x and y and printing the result
        System.out.println("Sum: "+sum(x,y));
        System.out.println("Difference: "+difference(x,y));
        System.out.println("Multiply: "+multiply(x,y));
        System.out.println("Division: "+division(x,y));
    }
}