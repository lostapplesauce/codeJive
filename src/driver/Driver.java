package driver;

import graphs.*;
import search.BinarySearch;

public class Driver {

    public static void main(String[] args){
        System.out.println("This is just practice file: ");
        TreeSort treeSort = new TreeSort();
        int[] testNum = {1,3,6,7,9,13,16,19,25,29,32,43,49,69,72,81};

        System.out.println("The number nine is in the " + BinarySearch.binarySearch(testNum, 9) + "th spot");
        System.out.println("The number 29 is in the " + BinarySearch.binarySearch(testNum, 29) + " spot");

    }
}
