class arrayExample {
    void demoArray() {
        int[] arr = new int[3];
        arr[0] = 54;
        arr[1] = 76;
        arr[2] = 45;
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        // int i=0;
        // while(i<3){
        // System.out.println(arr[i]);
        // i++;
        // }
    }

    void multiArray() {
        int[][] arr = { { 56, 45, 63 }, { 34, 76, 46 } };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}

public class traversingArray {
    public static void main(String[] args) {
        arrayExample obj = new arrayExample();
        // obj.demoArray();
        obj.multiArray();
    }
}
