class ArrayExample {
    void demoArray() {
        int[] arr = new int[3];
        arr[0] = 34;
        arr[1] = 24;
        arr[2] = 65;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

public class demoArray {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArray();
    }

}
