import java.util.Arrays;

public class ques3 {

    public static void main(String args[])
    {
        String s1="hello";
        // String s2="Shubham";

        char temp[]=s1.toCharArray();
        Arrays.sort(temp);
        s1=new String(temp);
        System.out.println(s1);


    }
    
}
