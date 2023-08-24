// We can't make global variables directly in java, so we have to declare a static variable in the class that acts as a global variable

public class Main {
    public static int num = 50; // acts as global variable for all methods

    public static void main(String[] args) {
        System.out.println("inside main method");
        int num = 10;
        // Here we have conflict with the name of global variable and local variable
        // If we try to print num, we get 10
        System.out.println(num);

        // To access the global variable we need to create object of this class we can use this keyword
        Main obj = new Main();
        System.out.println(obj.num);  // <-- Here we get 50
        System.out.println('\n');
        method2();
    }

    public static void method2(){
        System.out.println("inside method2");
        System.out.println("printing global variable");
        System.out.println(num); // here we can access global variable directly because here we don't have conflict with variable name
    }
}