import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n,fact=1;
        n = sc.nextInt();
        fact = factorial(n);
        System.out.println(fact);
    }
    static int factorial(int n){
         if(n==0){
             return 1;
         }   
        else{
            return(n*factorial(n-1));
        }
        }
}
