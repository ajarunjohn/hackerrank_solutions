import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void bubbleSort(int[] x, int n){
         
        int endPosition = x.length - 1;
        int swapPosition;
        int numSwap = 0;
            
        while( endPosition > 0 ){
            swapPosition = 0;
            
            for(int i = 0; i < endPosition; i++){
                
                if( x[i] > x[i + 1] ){
                    // Swap elements 'i' and 'i + 1':
                    int tmp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = tmp;
                    
                    swapPosition = i;
                    numSwap++;
                } // end if
            } // end for
            endPosition = swapPosition;
        } // end while
        
        System.out.println("Array is sorted in " + numSwap + " swaps.");
        System.out.println("First Element: " + x[0]);
        System.out.println("Last Element: " + x[n-1]);
    } // end bubbleSort
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(a, n);
    }
}
