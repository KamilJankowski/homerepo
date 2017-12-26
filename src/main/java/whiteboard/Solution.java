package main.java.whiteboard;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static ArrayList<Integer> mlist ;
    public  static int a;
    

    
    public void longestCommonPrefix(String[] strs, int count) {
    	//ArrayList<Integer> list = new ArrayList<Integer>(); 
    	for (int i = 0; i<=strs.length;i++){
            char[] ch = strs[i].toCharArray();
            //System.out.println(ch);
           
             count = ch.length;
             a=count;
            
          // mlist.add(count);
            //this.map.put(strs[i], new Integer(count));
            
                
        }
    	
    	
    
        
    }
    

   
    public static void main(String[] args){
        String[] arst = {"kamil", "daniel"};
        Solution s = new Solution();
       
        s.longestCommonPrefix(arst, a);
       
        	System.out.println(s.a);
       
       
    }
}

