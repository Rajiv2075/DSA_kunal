package Basics;

import java.util.Scanner;

public class CaseCheck
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char x=sc.next().trim().charAt(0);
        if(x<91&&x>64){
            System.out.println("Uppercase character.");
        }else if(x>96&&x<123){
            System.out.println("Lowercase character");
        } else if ( x>47&&x<58 ) {
            System.out.println("Number digit.");
        }else{
            System.out.println("Other character");
        }
    }
}
