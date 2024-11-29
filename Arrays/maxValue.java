// Calculate the maximum value out of all the elements in the array...
// arr[]={1,5,4,6}
// ans=6
// NOTE:- Only for +ve numbers...

class arrayExample {
    void maxArray() {
        int[] arr = { 5, 3, 6, 2, 8, 9 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.print("Max value is: " + ans);
    }

}

public class maxValue {
    public static void main(String[] args) {
        arrayExample obj = new arrayExample();
        obj.maxArray();
    }
}
