package Search;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] a, int target) {
        int left = 0, right  = a.length-1;
        while(left <= right) {
            int middle = (left+right) / 2;
            if (target < a[middle]) {
                right = middle-1;
            }
            else if (target > a[middle]) {
                left = middle+1;
            }
            else
                return middle;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] b = {1,2,3,4,5,67,8,9,10,200,4400,100,223,234,4238,3432345};
        Arrays.sort(b);
        int target = 10;
        // boolean found = false;
        int searchPos = binarySearch(b,target);
        System.out.print(searchPos);
    }

}