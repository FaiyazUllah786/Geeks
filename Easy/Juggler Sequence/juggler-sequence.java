//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(in.readLine());

            Solution ob = new Solution();
            List<Long> ans = new ArrayList<>();
            StringBuilder out = new StringBuilder();
            ans = ob.jugglerSequence(n);
            for (int i = 0; i < ans.size(); i++) out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static List<Long> jugglerSequence(long n) {
        // code here
        List<Long> li = new ArrayList<>();
        li.add(n);
        solve(li,n);
        
        return li;
    }
    
    static void solve(List<Long> li,long n){
        if(n<=1) return;
        if(n%2==0){
            long val = (long)Math.sqrt(n);
            li.add(val);
            solve(li,val);
        }else{
            long val = (long)(n*Math.sqrt(n));
            li.add(val);
            solve(li,val);
        }
    }
}