public class Pivot_Point {

        public int pivotIndex(int[] nums) {
            if(nums.length == 0)
            {
                return -1;
            }

            int [] prefix= new int [nums.length];
            prefix[0]= nums[0];

            for(int i=1; i<nums.length;i++)
            {
                prefix[i]= prefix[i-1]+nums[i];
            }

            for (int i=0;i<nums.length;i++)
            {
                int leftSum=(i == 0) ? 0 : prefix[i-1];
                int rightSum=prefix[nums.length-1] - prefix[i];
                if(leftSum == rightSum)
                {
                    return i;
                }
            }

            return -1;
        }

    public static void main(String[] args) {
        Pivot_Point p= new Pivot_Point();
        int [] nums= {2,3,4,4,2};
        System.out.println(p.pivotIndex(nums));
    }

}
