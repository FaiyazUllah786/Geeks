//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int t = n;
        int cnt = 0;
        while(t>0){
            cnt++;
            t=t/10;
        }
        int temp = n;
        int sum = 0;
        while(temp>0){
            int digit = temp%10;
            sum+=Math.pow(digit,cnt);
            temp = temp/10;
        }
        
        if(sum==n) return "true";
        return "false";
    }
}