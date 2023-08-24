public class Main {
    public static int increment(int a){
        a++;        // Using increment ( ++ ) operator
        return a;
    }
    public static int decrement(int a){
        a--;    // Using decrement ( -- ) operator
        return a;
    }

    public static void main(String[] args) {
        int x = 50;
        int y = 20;

        System.out.println("Value of x before increment: "+x);

        // incrementing x
        x = increment(x);
        System.out.println("Value of x after increment: "+x);

        System.out.println("Value of y before decrement: "+y);

        // decrementing y
        y = decrement(y);
        System.out.println("Value of y after decrement: "+y);
    }
}