
package com.mycompany.csc229_lab_work_3;

/**
 *
 * @author johnf
 */
public class SortSearch {
    
    static void bubbleSort(int[]  a, int size ) {
        int outer, inner, temp;
        for (outer = size-1; outer > 0; outer--) {  // counting down
            for (inner = 0; inner < outer; inner++) {        // bubbling up
                if (a[inner] > a[inner + 1]) {  // if out of order...
                    temp = a[inner];          // ...then swap
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }
    
    //algorithm = O(n) 
    static int linearSearch(int[] nmLst, int search) {
       for (int i = 0; i < nmLst.length; i++) {
           if (search == nmLst[i]) {
           return i;
           }
        }
        
       return -1;
    }
    
    //algorithm = O(log n)
    static int binarySearch(int search, int[] array) {
       int start = 0;
       int end = array.length - 1;
       
       while (start <= end) {
           int middle = (start + end) / 2;
           if (search < array[middle]) {
               end = middle - 1;
           }
           if (search > array[middle]) {
               start = middle + 1;
           }
           if (search == array[middle]) {
               return middle;
           }
       }
       return -1;
    }
    
    static void printArray(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
       }
   }
public static void main (String args[]) {
    int[] arr = {44, 1, 3, 5, 8, 7, 31, 22, 42, 13, 19, 27};
    System.out.println("Printing sorted array: ");
    bubbleSort(arr, arr.length);
    printArray(arr);
    
    int search = 42;
    System.out.println("Linear Search: " + linearSearch(arr, search));
    
    
    search = 19;
    System.out.println("Binary Search: " + binarySearch(search, arr));
    
}
}


