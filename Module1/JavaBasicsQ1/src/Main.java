// How to create a class, object, method and its signature

// Creating a class
class TempClass{
    // Class method
    public void method1(){
        System.out.println("TempClass method is called");
    }
}

public class Main {

    public static void main(String[] args) {
        // Creating class object
        TempClass obj = new TempClass();

        // Calling TempClass method using object of TempClass
        obj.method1();
    }
}