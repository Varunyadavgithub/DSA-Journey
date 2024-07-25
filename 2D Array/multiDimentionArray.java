class arrayExample {
    static void multiArray() {
        // int[][]arr_1=new int[5][3];
        int[][] arr = { { 56, 45, 63 }, { 76, 36, 83 }, { 67, 87, 47 } };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println();

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println();

        System.out.println(arr[2][0]);
        System.out.println(arr[2][2]);
        System.out.println(arr[2][1]);
    }
}

public class multiDimentionArray {
    public static void main(String[] args) {
        arrayExample obj = new arrayExample();
        obj.multiArray();
    }
}
