/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.prahar.LinkedList;

public class doublyll {
    
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        } 
    }
    public static class dll{
        Node head = null;
        Node tail = null;

        private void insertatend(int i) {
            Node temp = new Node(i);
              if(head==null){
                  head = temp;
              }
              else{
                  tail.next = temp;
              }
              tail = temp; 
            
        }
        
        private void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        
        
    }
    
    public static void main(String args[]){
        dll ll = new dll();
        ll.insertatend(1); 
        ll.display();
        ll.insertatend(2);
        ll.display();
         ll.insertatend(3);
        ll.display();
        
    }
    
}
