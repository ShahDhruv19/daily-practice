package Practise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {

    public static int binary(int[] arr,int key)
    {
        int left=0;
        int right=arr.length-1;

//        2,4,5,7,8
        while(left<right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
//            return -1;

        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr={2,4,5,7,8};
        int k=7;
        int x=binary(arr,k);
        System.out.println(x);
    }
}
