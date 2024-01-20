package Linear_Search;

public class InStringSearch {
    public static void main(String[] args) {

        String str="rajivkumarhello";
        char ch='r';
        int start=3;
        System.out.println(Math.log10(889));
        int end=5;
        int x=Integer.MIN_VALUE;
        System.out.println(str);
      //  System.out.println(search(str,ch));
        System.out.println(searchRange(str,ch,start,end));
    }

    public static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }

        for(int i=0;i<str.length();i++){
            if(str.trim().charAt(i)==target){
                return true;
            }
        }
        return false;
    }

    public static boolean searchRange(String str,char target,int start,int end){
        if(str.length()==0||str.length()<=end||start<0){
            return false;
        }

        for(int i=start;i<=end;i++){
            if(str.trim().charAt(i)==target){
                return true;
            }
        }

        return false;
    }
}
