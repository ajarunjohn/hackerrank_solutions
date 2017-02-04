import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double p,m,z;
        double pc=0.0,nc=0.0,zc=0.0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
         for(int arr_i=0; arr_i < n; arr_i++){
             if(arr[arr_i]<0){
                 nc++;
             }
             else if(arr[arr_i]>0){
                 pc++;
             }
             else{
                 zc++;
             }
         }
        p=pc/n;
        m=nc/n;
        z=zc/n;
        System.out.printf("%.6f\n%.6f\n%.6f",p,m,z);
         
    }
}
