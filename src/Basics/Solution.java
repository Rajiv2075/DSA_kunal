package Basics;
import java.util.*;

public class Solution {

    public static boolean checkBits(int n) {
        // Write your code here.
        String str=Integer.toBinaryString(n);
        System.out.println("In binary "+str);
        int len=str.trim().length();
        System.out.println("  "+len);
        for(int i=0;i<len-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                return false;
            }
        }
       return true;
    }

    public static void main(String[] args) {
        int n=85;
        boolean res=checkBits(n);
        System.out.println("Result "+res);
    }
}