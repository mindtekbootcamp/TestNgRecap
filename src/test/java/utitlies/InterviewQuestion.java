package utitlies;

import java.util.Arrays;

public class InterviewQuestion {

    public static void main(String[] args) {
        /*
        String str = "am best I the";

        write code two get output as -> "I am the best";
         */
        String str = "am worse I the abcdseggd ytrew abcd";
        String[] words=str.split(" ");
        int[] lengths=new int[words.length];

        for(int i=0; i< words.length; i++){
            lengths[i]=words[i].length();
        }

        System.out.println(Arrays.toString(lengths));
        Arrays.sort(lengths);
        System.out.println(Arrays.toString(lengths));

        String output="";

        for(int i=0; i<lengths.length; i++){
            for(int a=0; a<words.length; a++){
                if(lengths[i]==words[a].length() && !output.contains(words[a])){
                    output+=words[a]+" ";
                    break;
                }
            }
        }
        System.out.println(output.trim());


    }


}
