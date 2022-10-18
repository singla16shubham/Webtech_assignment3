class ques1{
    public static void main(String args[]){
        String s1="raghav";
        String s2="r@ghav";

       s2= s2.toLowerCase();
        s1=s1.toLowerCase();
       

         int i=0;
         int size=Math.min(s1.length(), s2.length());
        //   size will be having minimum of two length

         while(i<size)
         {  char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            i++;
            if(ch1==ch2)
            {
                continue;
            }
            else if(ch1>ch2)
            {
                System.out.println(s1+" is lexographically greater");
                return;
            }
            else{
                System.out.println(s2+" is lexographically greater");
                return;
            }
            
         }

         if(s1.length()==s2.length())
         {
            System.out.println(s1+" and "+s2 +" are Equal");
            return;
         }


         if(i<s1.length())
         {
            System.out.println(s1+" is lexographically greater");
         }
         else{
            System.out.println(s2+" is lexographically greater");
         }
        //  System.out.println(s1+" and "+s2+" are equal");
    }
}