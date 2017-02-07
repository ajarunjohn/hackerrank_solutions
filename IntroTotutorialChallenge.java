import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,i,v;
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        n = sc.nextInt();
        int[] ar = new int[n];
        for(i=0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        
        for(i=0; i<n; i++){
            if(ar[i]==v){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
