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
            System.out.println(ob.firstElement(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
     int mod=1000000007;
    int firstElement(int n) {
        int first=1,sec=1,sum=1;
        for(int i=0;i<n-2;i++)
        {
            sum=(first%mod)+(sec%mod);
            first=sec%mod;
            sec=sum%mod;
        }
        return sum%mod;
    }
}