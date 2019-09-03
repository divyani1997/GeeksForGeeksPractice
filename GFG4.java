{
//Initial Template for Java
import java.util.*;
//Position this line where user code will be pasted.
// Driver class with Driver code
class GFG4
{
	// Driver code
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    // Declaring stack of integers
		    Stack <Integer> st = new Stack<Integer>();
		    
		    int q = sc.nextInt();
		    
		    // Working with queries
		    while(q-- > 0)
		    {
		        char ch = sc.next().charAt(0);
		        Geeks obj = new Geeks();
		       if(ch == 'i')
		      {
		         int x = sc.nextInt();
		         obj.insert(st, x);
		      }
		    
		      if(ch == 'r')
		      {
		          obj.remove(st);
		      }
		      
		      if(ch == 'h')
		      {
		          obj.headOf_Stack(st);
		      }
		      if(ch == 'f')
		      {
		          int x = sc.nextInt();
		          obj.find(st, x);
		      }
		      
		      
		    }
		    // System.out.println();
		 }
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
// Helper class to implement functions
// insert : to insert element to stack
// remove : to pop element from stack
// headOf_Stack : to return top of stack
// find : to find the element in stack
class Geeks
{
    // Function to insert element to stack
    public static void insert(Stack<Integer> st, int x)
    {
        // Your code here
        st.push(x);
        
    }
    
    // Function to pop element from stack
    public static void remove(Stack<Integer> st)
    {
        int x = st.pop();// Your code here
        
        
    }
    
    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st)
    {
        int x = st.peek();// Your code here
        System.out.println(x + " ");
    }
    
    // Function to find the element in stack
    public static void find(Stack<Integer> st, int val)
    {
    
        if(st.search(val)!=-1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}

