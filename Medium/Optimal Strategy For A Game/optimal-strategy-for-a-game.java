//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class OptimalStrategy
{
    public static void main (String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //inserting the elements
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
           //calling the countMaximum() method of class solve
           System.out.println(new solve().countMaximum(n, arr)); 
        }
    }
    
    
}
// } Driver Code Ends



class solve
{
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int n, int arr[])
    {
        // Your code here
        long[][] dp = new long[n+1][n+1];
        for(long i[]:dp) Arrays.fill(i,-1);
        
        return dfs(0,n-1,arr,dp);
    }
    
    static long dfs(int left,int right,int arr[],long dp[][]){
        if(left>right) return 0;
        
        if(dp[left][right]!=-1) return dp[left][right];
        
        long takeLeft = arr[left]+Math.min(dfs(left+2,right,arr,dp),dfs(left+1,right-1,arr,dp));
        
        long takeRight = arr[right] + Math.min(dfs(left+1,right-1,arr,dp),dfs(left,right-2,arr,dp));
        
        return dp[left][right] = Math.max(takeLeft,takeRight);
    }
}
