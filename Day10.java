import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0, tempAns = 0;
        while(n>0){
            if(n%2==1){
            ans++;
            } 
            n = (int) Math.floor(n/2);
            if(n%2==0){
                if(ans>=tempAns){
                    tempAns = ans;
                    ans = 0;    
                } else {
                    ans= 0;
                }
            }
        }
        if(ans>=tempAns){
            System.out.println(ans);
        } else{
            System.out.println(tempAns);
        }
    }
} 
