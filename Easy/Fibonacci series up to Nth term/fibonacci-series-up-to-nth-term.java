//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    int[] Series(int n) {
        // code here
        int[] ans = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        for(int i=2;i<=n;i++){
            int sum = ans[i-2]+ans[i-1];
            int val = (int)(sum%(1e9+7));
            ans[i]=val;
        }
        return ans;
    }
}