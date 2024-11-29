// Search the given element x in the array if present then return the index else return -1...
// arr[]={1,5,3,6,7}
// x=6 ,   ans=3 (6 is present at 3rd index)

class arrayExample {
    void searchArray() {
        int[] arr = { 10, 5, 3, 6, 2, 8, 4 };
        int x = 2;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        System.out.print("Found " + x + " at index " + ans);
    }
}

public class searchArray {
    public static void main(String[] args) {
        arrayExample obj = new arrayExample();
        obj.searchArray();
    }

}
