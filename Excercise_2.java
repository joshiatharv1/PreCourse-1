public class Excercise_2 { 
// Time Complexity :Push(), pop(), Peek(), isEmpty() all are O(1)
// Space Complexity : O(N) , Depends on the Nodes created. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

    StackNode root; 

    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data=data;
            this.next=null;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        return root==null;
    } 
  
    public void push(int data) 
    { 
        //Write code to push data to the stack. 
        StackNode node=new StackNode(data);
        root.next=node;
        root=node;
    } 
  
    public int pop() 
    { 	
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    if (isEmpty()) { 
            System.out.println("Stack Underflow");
            return 0; 
        }
        int popped = root.data;
        root = root.next;
        return popped;
    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        if (isEmpty()) { 
            System.out.println("Stack is empty");
            return 0; 
        }
        return root.data;
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Excercise_2 sll = new Excercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
