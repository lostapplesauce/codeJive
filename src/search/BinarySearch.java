package search;

public class BinarySearch {
    public static int binarySearch(int[] values, int x){
        int start = 0;
        int end = values.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(values[mid] == x)
                return mid;
            else if(values[mid] < x)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }
}
