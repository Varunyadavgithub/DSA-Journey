import java.util.*;

public class thirdSmallest {
    public static void thirdSmallestElement(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Invalid input ");
            return;
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (first > current) {
                third = second;
                second = first;
                first = current;
            } else if (second > current) {
                third = second;
                second = current;
            } else if (third > current) {
                third = current;
            }
        }
        System.out.println("The third smallest elements is: " + third);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array;");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        thirdSmallestElement(arr);
        sc.close();
    }
}