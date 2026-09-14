package Recursion;//package Recursion;
//
//public class ReverseArray {
//    public void reverseArray(int firstIndex, int[] arr, int lastIndex )
//    {
//        if (firstIndex >lastIndex) {
//            return;
//        }
//        int i = arr[firstIndex];
//
//        arr[firstIndex]=arr[lastIndex];
//        arr[lastIndex]=i;
//        reverseArray( firstIndex+1,arr,lastIndex-1);
//
//
//
//
//
//    }
//
//    public static void main(String[] args) {
//        ReverseArray reverseArray= new ReverseArray();
//        int []arr={2,3,4,5,6};
//        reverseArray.reverseArray(0,arr,arr.length-1);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//
//    }
//}



//2nd appraco better approach

public class ReverseArray {
    public void reverseArray(int firstIndex, int[] arr, int n)
    {
        if (firstIndex >=n/2) {
            return;
        }
        int i = arr[firstIndex];

        arr[firstIndex]=arr[n-firstIndex-1];
        arr[n-firstIndex-1]=i;
        reverseArray( firstIndex+1,arr,n);





    }

    public static void main(String[] args) {
        ReverseArray reverseArray= new ReverseArray();
        int []arr={2,3,4,5,6};
        int n= arr.length;
        reverseArray.reverseArray(0,arr,n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}



