package tests;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InterviewQuestion {

    public static int[] getDistance(String str, char c){
        // Hello, l -> []
        if(str==null) return null;
        int[] nums=new int[str.length()];

        if(!str.contains(c+"")) {
            for(int i=0; i<nums.length; i++) nums[i]=-1;
            return nums;
        }


        for(int i=0, a=1; i<str.length();){
            if(str.charAt(i)==c) {
                i++;
                continue;
            }
            if(i+a<str.length() && str.charAt(i+a)==c){
                nums[i]=a;
                a=1;
                i++;
            }else if(i-a>=0 && str.charAt(i-a)==c){
                nums[i]=a;
                a=1;
                i++;
            }else{
                a++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getDistance("Hello",'l')));
        System.out.println(Arrays.toString(getDistance("loveleetcode",'e')));
        System.out.println(Arrays.toString(getDistance("",'e')));
        System.out.println(Arrays.toString(getDistance(null,'e')));
        System.out.println(Arrays.toString(getDistance("fjdjs",'a')));
    }

}
