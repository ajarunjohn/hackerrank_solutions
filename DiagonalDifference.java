import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum_p=0,sum_s=0,diff=0;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        for(int a_i=0; a_i < n; a_i++){
                    sum_p=sum_p+a[a_i][a_i];
                    sum_s=sum_s+a[a_i][n-a_i-1];
            
                }
        diff=sum_p-sum_s;
        System.out.println(Math.abs(diff));
            }
       
}
