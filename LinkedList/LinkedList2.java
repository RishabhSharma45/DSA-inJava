/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.prahar.LinkedList;

/**
 *
 * @author Ashish Katare
 */
public class LinkedList2 {
    public static class Node{
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
            }
            
        }
    public static class linkedls{
        Node head = null;
              Node tail = null;
        
         void insertAtEnd(int val){
              Node temp = new Node(val);
              if(head==null){
                  head = temp;
              }
              else{
                  tail.next = temp;
              }
              tail = temp;
        }
         
         void insertAtStart(int val){
             Node temp = new Node(val);
             temp.next = head;
             head = temp;
         }
        
         void insertAtMid(int val , int pos){
             Node temp = new Node(val);
             Node t = head;
             int count = 1;
             while(count!=pos-1){
                 count++;
                 t = t.next;
             }
              temp.next = t.next;
             t.next = temp;
            
         }
         
         void deleteatfirst(){
             head = head.next;
         }
         void deleteatlast(){
             Node t = head;
             if(head==null){
                 System.out.print("ll empty");
             }
             else{
                 while(t.next.next!=null){
                     t = t.next;
                 }
                 t.next = t.next.next;
             }
            
         }
         
         void deleteatanypos(int pos){
             Node t = head;
             int count = 1;
             while(count!=pos-1){
                 count++;
                 t = t.next;
             }
              t.next = t.next.next;
         }
        
        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        
        public void size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
               count++;
                temp = temp.next;
            }
            System.out.println(count);
            
        }
    }
    public static void main(String args[]){
        linkedls ll = new linkedls();
        ll.insertAtEnd(2);
        ll.display();
        ll.insertAtEnd(4);
         ll.display();
         ll.size();
         ll.insertAtStart(1);
         ll.display();
             ll.size();
             ll.insertAtMid(3, 3);
             ll.display();
             ll.size();
             ll.deleteatfirst();
             ll.display();
             ll.deleteatlast();
             ll.display();
             ll.insertAtStart(1);
             ll.insertAtEnd(4);
             ll.display();
             ll.deleteatanypos(3);
             ll.display();
             
    }
}
