// Time Complexity :Push(), pop(), Peek(), isEmpty() all are O(1)
// Space Complexity : O(N) , Depends on the Nodes created. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 


// a Singly Linked List 
public class Excercise_3 { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
           this.data=d;
           this.next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static Excercise_3 insert(Excercise_3 list, int data) 
    { 
        // Create a new node with given data 

        Node node=new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null){
            list.head=new Node(data);
        }
        else{
            Node current=list.head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
        }
            // Else traverse till the last node 
            // and insert the new_node there 
            // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Excercise_3 list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
            // Go to next node 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Excercise_3 list = new Excercise_3(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}