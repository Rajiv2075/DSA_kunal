package Basics;

import java.util.Scanner;

/**
class Date
{
    Scanner sc=new Scanner(System.in);
    int d;
    int m;
    int y;

    Date(){
        d=1;
        m=1;
        y=2003;
    }
    Date(int d1){
        d=d1;
        m=1;
        y=2003;
    }
    Date(int d1,int m1){
        d=d1;
        m=m1;
        y=2003;
    }
    Date(int d1,int m1,int y1){
        d=d1;
        m=m1;
        y=y1;
    }

    Date(Date x){
        d=x.d;
        m= x.m;
        y= x.y;
    }

    public void input(){
        System.out.println("Enter the date: ");
        d=sc.nextInt();
        System.out.println("Enter the month: ");
        m=sc.nextInt();
        System.out.println("Enter the year: ");
        y=sc.nextInt();

    }

    public void show(){
        System.out.println("The Date is: "+d+"-"+m+"-"+y);
    }

}
*/

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /**
        Date d1=new Date();
        Date d2=new Date(12);
        Date d3=new Date(12,12);
        Date d4=new Date(12,2,2005);
        Date d5=new Date(d3);

        d1.show();
        d2.show();
        d3.show();
        d4.show();
        d5.show();
        d4.input();
        d4.show();


        /**
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
            System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        System.out.println("Result: "+c);
        System.out.println("Result: "+d);
        System.out.println("Result: "+e);
        System.out.println("Result: "+f);

        if(a>5){
            System.out.println("Hello");
        } else if ( a==5 ) {
            System.out.println("kaise");
        }else{
            System.out.println("Hii");
        }

        for(int i=0;i<a;i++){
            System.out.println("Hello");
        }

        switch ( a ) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid month number");




        }

     myloop:        for(int i=0;i<10;i++){
            myloop2:   for(int j=0;j<10;j++){
                System.out.print("hello  ");
                if(j==5){
                    break myloop;
                }
            }
            System.out.println();
        }

        System.out.println("Enter the radius: ");
        int r=sc.nextInt();
         int res=22*r*r/7;
        System.out.println("Result: "+res);

        System.out.println("Enter the size of the arrays: ");
        int n= sc.nextInt();

        int []arr=new int [n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the data: ");
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements of Array: ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        System.out.println("Enter the size of the Array: ");
        int n=sc.nextInt();

        int[]  arr=new int [n];
        int res=1;

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the data: ");
            arr[i]=sc.nextInt();
            if(arr[i]%2==1&&arr[i]!=0){
                res=res*arr[i];
            }
        }

        System.out.println("Elements of the Array: ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nProduct of the odd elements of the Array is : "+res);



        System.out.println("Enter the principle amount: ");
        int p=sc.nextInt();
        System.out.println("Enter the rate: ");
        float r=sc.nextFloat();
        System.out.println("Enter the time: ");
        float t=sc.nextFloat();

        double res=p*Math.pow((1+(r/100)),t);
        System.out.println("Result: "+res);

 */

      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
//
//      int max=a;
//      if(max<b){
//          max=b;
//      }
//      if(max<c){
//          max=c;
//      }
        int max=Math.max(Math.max(a,b),c);

        System.out.println("Largest Number: "+max);


    }
}
