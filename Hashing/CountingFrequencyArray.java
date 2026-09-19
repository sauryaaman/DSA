package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingFrequencyArray {

    public void frequencyElement( int arr[])
    {
        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length ; i++) {

            Integer c= map.get(arr[i]);
            if (c == null) {
                map.put(arr[i],1 );
            }else {
                map.put(arr[i],++c );
            }

        }

        System.out.println(map);
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,1,3,2,3,3,3,3};
        CountingFrequencyArray frequencyArray=new CountingFrequencyArray();
        frequencyArray.frequencyElement(arr);
    }

}
