//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int[] runningSum(int[] nums)
    {
        int[] prefix=  new int [nums.length];

        prefix[0]=nums[0];

        for (int i=1;i<nums.length;i++)
        {
            prefix[i]=nums[i]+prefix[i-1];

        }


        return prefix;






    }
    public static void main(String[] args) {
       Main main= new Main();
       int [] nums= {1,2,3,4};
       for(int num: main.runningSum(nums))
       {
           System.out.println(num);
       }




    }
}