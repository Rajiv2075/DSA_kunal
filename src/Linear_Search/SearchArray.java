package Linear_Search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) {

        int[] arr={1,4,2,6,5,3,8,4};
        int target=4;
        System.out.println(Arrays.toString(arr));
        boolean res=search1(arr,target);
        System.out.println(res);
    }

    static  int search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

    static  boolean search1(int[] arr, int target){
        if(arr.length==0){
            return false;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }

        return false;
    }

}
