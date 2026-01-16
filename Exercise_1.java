 // Time Complexity :Push(), pop(), Peek(), isEmpty() all are O(1)
// Space Complexity : O(N) Since we are using a Constant space array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Made Mistake at Preincrement and Post Increment Logic


class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==-1){
            return true;
        }
        return false;
    } 

    Stack() 
    { 
        this.top=-1;
    } 
  
    boolean push(int x) 
    { 
        if(top==MAX-1){
            System.out.println("Stack overflow");
            return false;
        }
        a[++top] = x;
        return true;
        //Top will point to the last inserted lelment in the array so before inserting in array we need new top value
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top==-1){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return a[top--];
        
    } 
  
    int peek() 
    { if(top==-1){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
