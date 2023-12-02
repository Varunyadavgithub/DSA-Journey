import java.util.Scanner;
public class arrayReference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System .out.print("Enter "+n+" elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Trying to copy arr to arr_2
        int[] arr_2 = arr;      //This is known as shallow copy...
        for(int i=0;i<n;i++){
            System.out.print(arr_2[i]+" ");
        }
    }
    
}
