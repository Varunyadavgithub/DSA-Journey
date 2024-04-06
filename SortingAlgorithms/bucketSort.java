package SortingAlgorithms;

import java.util.ArrayList;

/*A sorting algorithm that workd by distributing the elements of
 * an array into a numbers of buckets.
 * 
 * step-1 Put all elements in 'b' numbers of bucket.
 * step-2 Sort each buckets indevidually.
 * step-3 Take out all elements and join them.
 * 
 * T.C = O(n+k) S.C = O(n)
 * In worst case T.C = O(n^2)
 */
public class bucketSort {
    static void bucketSort(float[] arr){
        int n=arr.length;
        ArrayList<float>[] buckets=new ArrayList[n];
        // Create empty buckets
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<float>();
        }
        // Add all elements into our buckets
        for(int i=0;i<n;i++){
            int bucketIdx=(int) arr[i]*n;
            buckets[bucketIdx].add(arr[i]);
        }
        // Sort each buckets individually
        for(int i=0;i<buckets.length;i++){
            collections.sort(buckets[i]);
        }
        // Merge all buckets to get final sorted array
        int idx=0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<float> currBucket=buckets[i];
            for(int j=0;j<currBucket.size();j++){
                arr[idx++]=currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float[] arr={0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketSort(arr);
        for(float val:arr){
            System.out.print(val+" ");
        }
    }
}
