import java.util.*;
public class ques4 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        while(n!=1)
        {  System.out.print(n+" ");
            if(n%2==0)
            {
                n=n/2;
            }
            else{
                n=n*3;
                n+=1;
            }
           
        }
        System.out.print(n);
        sc.close();

    }
    
}
