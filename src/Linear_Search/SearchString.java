package Linear_Search;

import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {

        String[] str={"rajiv","niraj","sivam","siva","sumit"};
        String target="suman";
        System.out.println(Arrays.toString(str));
        boolean res=search(str,target);
        System.out.println("Result "+res);
    }

    public static boolean search(String[] str, String target){

        if(str.length==0){
            return false;
        }
        for(int i=0;i<str.length;i++){
            if(str[i]==target){
                return true;
            }
        }
        return false;
    }
}
