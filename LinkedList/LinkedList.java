/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.prahar.LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
         
    }
      public static void display(Node head){
          Node temp = head;
          while(temp!=null){
              System.out.print(temp.data + " ");
              temp = temp.next;
          }
      }
      
      public static void displayrec(Node head){
          if(head==null)return;
          System.out.print(head.data + " ");
          displayrec(head.next);
      }
      
      public static void length(Node head){
          Node temp = head;
          int count=0;
          while(temp!=null){
              count++;
              temp = temp.next;
          }
          System.out.println(count);
      }
      
      static int count = 1;
      public static int lengthrec(Node head){
          if(head==null)return count;
          lengthrec(head.next);
          return count++;
          
      }
      
      
      
    public static void main(String args[]){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        display(a);
        displayrec(a);
        length(a);
        System.out.println(lengthrec(a));
    }
}
