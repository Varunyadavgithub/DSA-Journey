package QuestionsOnSorting;
/*Given an array of size 'n' containing only 0s,1s and 2s sort the 
array in ascending order.
Input : n=6, arr={0,2,1,2,0,0}
Output : arr={0,0,0,1,2,2}
 */
public class sortZerosOnesAndTwos {
    // Method-1    T.C = O(n) S.C = O(1)

    // static void sortZerosOnesAndTwos(int[] arr){
    //     int count_zeros=0,count_ones=0,count_twos=0;
    //     for(int val:arr){
    //         if(val==0){
    //             count_zeros++;
    //         }
    //         else if(val==1){
    //             count_ones++;
    //         }else{
    //             count_twos++;
    //         }
    //     }
    //     int k=0;
    //     while(count_zeros>0){
    //         arr[k++]=0;
    //         count_zeros--;
    //     }
    //     while(count_ones>0){
    //         arr[k++]=1;
    //         count_ones--;
    //     }
    //     while(count_twos>0){
    //         arr[k++]=2;
    //         count_twos--;
    //     }
    // }

    // Method-2     T.C = O(n) S.C = O(1)

    static void sortZerosOnesAndTwos(int[] arr){
        int l=0,mid=0,h=arr.length-1;
        // Explore the unknown region
        while(mid<=h){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[l];
                arr[l]=temp;
                l++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[h];
                arr[h]=temp;
                h--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,2,0,0,1,1,2,0,1,0};
        sortZerosOnesAndTwos(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
