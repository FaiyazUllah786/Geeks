//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    Node head = null, tail = null;
		    
		    char head_c = sc.next().charAt(0);
		    head = new Node(head_c);
		    tail = head;
		    
		    while(n-- > 1){
		        tail.next = new Node(sc.next().charAt(0));
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    //show(head);
		    show(obj.arrangeCV(head));
		    
		}
	}
	
	public static void po(Object o){
	    System.out.println(o);
	}
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        List<Character> vowels = new ArrayList<>();
        List<Character> consonant = new ArrayList<>();
        while(head!=null){
            char val = head.data;
            if(val == 'a'||val == 'e'||val == 'i'||val == 'o'||val == 'u'){
                vowels.add(val);
            }else{
                consonant.add(val);
            }
            head = head.next;
        }
        Node ans = new Node('0');
        Node temp = ans;
        int idx = 0;
            while(idx<vowels.size()){
                char val = vowels.get(idx++);
                Node t = new Node(val);
                temp.next = t;
                temp = temp.next;
            }
            idx = 0;
            while(idx<consonant.size()){
                char val = consonant.get(idx++);
                Node t = new Node(val);
                temp.next = t;
                temp = temp.next;
            }
        return ans.next;
    }
}