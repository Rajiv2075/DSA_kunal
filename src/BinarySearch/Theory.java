package BinarySearch;

import java.util.Arrays;

public class Theory  {
    public static void main(String[] args) {
       int[] arr={1,2,4,6,7,8,9,11,13,15,19};
        System.out.println(Arrays.toString(arr));
        int target=15;
        System.out.println("Target "+target);
        int index=binarySearch(arr, target);
        System.out.println("Result "+index+" ");
    }

    public static int binarySearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }

        int start=0;
        int end=arr.length;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
       return -1;
    }
}
