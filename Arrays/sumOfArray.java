// Calculate the sum of all the elements in the given array...
// arr[]={5,4,3}
// sum=5+4+3 => 12
class arrayExample{
    void sumOfArray(){
        int[] arr={5,4,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("The sum of array is: "+sum);
    }
}
public class sumOfArray {
    public static void main(String[] args){
        arrayExample obj=new arrayExample();
        obj.sumOfArray();
    }
    
}
