import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int j=0;j<n;j++){
            for(int i=1;i<=n;i++){
                System.out.print(i<n-j?" ":"#");
            }
            System.out.println("");
        }
    }
}
