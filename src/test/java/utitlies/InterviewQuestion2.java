package utitlies;

public class InterviewQuestion2 {

    public static void main(String[] args) {
        String one   = "abcd";
        String two   = "abc";
        String three = one.substring(0, one.length());
        String four = one.substring(0, one.length()-1);
        System.out.println(two);
        System.out.println(four);
        System.out.println(two==four);
        System.out.println((one==three) +"-"+ (two==four));
    }

}
