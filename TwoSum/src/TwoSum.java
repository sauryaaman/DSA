public class TwoSum {
    public void twosum(int []arr,int target)
    {
        int left= 0;
        int right=arr.length-1;

       while(left<right)
       { int sum=arr[left]+ arr[right];
           if (sum ==target) {
               System.out.println("pair found for the target and elment is "+arr[left]+"and0 "+ arr[right]);
               break;
           }

           if(sum<target)
           {
               left++;
           }else {
               right--;
           }
       }



    }
}
