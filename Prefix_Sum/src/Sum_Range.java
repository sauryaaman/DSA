class Sum_Range {

    private int[] prefix;

    public Sum_Range(int[] nums) {

        prefix = new int[nums.length + 1];


        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        return prefix[right + 1] - prefix[left];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 5, 6, 3, 5, 2, 5};
        Sum_Range numArray = new Sum_Range(nums);


        System.out.println(numArray.sumRange(1, 3));
    }
}
