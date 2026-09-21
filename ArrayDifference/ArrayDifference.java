package ArrayDifference;

public class ArrayDifference {


    public void     differenceArray(int [] arr,int l,int r,int add)
    {
        int [] diff= new int[arr.length];
        int left=l;
        int right=r;
        int adds=add;

        diff[l]+=adds;

        diff[right+1]-=adds;



        //prefix sum
   int []prefixSum= new int[diff.length];
   prefixSum[0]=diff[0];

        for (int i = 1; i < diff.length; i++) {
            prefixSum[i]=prefixSum[i-1]+diff[i];
        }

        for (int i = 0; i < arr.length; i++) {
            prefixSum[i]+=arr[i];
        }


        for (int i = 0; i < diff.length; i++) {
            System.out.println(prefixSum[i]);
        }

    }

    public static void main(String[] args) {
        int []arr= {1,2,3,4,3,8,9};
        int  add= 5;
        ArrayDifference d= new ArrayDifference();

        d.differenceArray(arr,1,5,add);
    }
}
