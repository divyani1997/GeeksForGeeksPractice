{
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class GFG5 {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            obj.reverse(sc.next());
        }
	}
}

}
/*This is a function problem.You only need to complete the function given below*/

class Solution {
    
    public void reverse(String str){
       //your code here
       Stack<Character> s=new Stack<>();
       for(int i=0;i<str.length();i++){
           s.push((Character)str.charAt(i));
       }
       while(!s.isEmpty()){
           System.out.print(s.pop());
       }
       System.out.println();
    }
}
