package reverseArray;

public class reverseArray {
    public static void main(String[] args) {
        reverseFunction r= new reverseFunction();
        int [] arr={1,2,3,4};
        r.reverseArray(arr);

        for(int n:arr)
        {
            System.out.print(n);
        }
    }
}
