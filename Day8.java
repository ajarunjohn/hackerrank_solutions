import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         HashMap<String, Integer> map = new HashMap<>();
        in.nextLine();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);  
            in.nextLine();
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (map.containsKey(s)) {
                System.out.println(s+"="+map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
