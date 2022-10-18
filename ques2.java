
public class ques2 {

    public static void main(String args[]) {
        // int arr[]={1,4,8,4,9,0,3,4,11,15,8,2,1,5,10,7,19,13,17,2};
        int arr[] = { 2, 9, 7, 4, 1, 8, 4 };
        int output[]=new int[arr.length+1];
        int p = -1;
        for (int i = 0; i < arr.length; i++)
            p = Math.max(p, arr[i]);
        int[] count = new int[p + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
     

        for (int i = 1; i <= p; i++) {
            count[i] += count[i - 1];
        }
       
        for (int i = arr.length-1; i>=0; i--) {
            
           
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
       

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=output[i];
        }
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
