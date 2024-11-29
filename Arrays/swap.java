// Swap the numbers...

public class swap {
    static void swapNum(int a, int b) {
        System.out.println("Original value of a and b");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value after swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        // int a = 9;
        // int b = 3;
        swapNum(9, 3);
    }
}

// Without using temp variable...
// a = a+b;
// b = a-b;
// a = a-b;