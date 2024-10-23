/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.prahar;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class queue {

    public static class arrayQueue {

        int[] arr = new int[10];
        int front = 0;
        int rear = 0;

        public void add(int a) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            arr[rear] = a;
            rear++;
        }

        public int peek() {
            if (rear == 0) {
                System.out.println("queue is Empty");
            }
            return arr[front];
        }

        public int remove() {
            if (front == rear) {
                System.out.println("queue is Empty");
            }
            int a = arr[front];
            front++;
            return a;
        }

        public void display() {
            int a = front;
            int b = rear;
            while (a != b) {
                System.out.print(arr[a] + " ");
                a++;
            }
            System.out.println();
        }

    }

      public static class llqueue{
          public class node{
              
              int data;
              node next;
              
              node(int data){
                  this.data = data;
              }
          }
          node head = null;
          node tail = null;
          
          public void add(int data){
               node temp = new node(data);
              if(head==null){
                  head = temp;
              }
              else{
                  tail.next = temp;
              }
             
                    tail = temp;
          
      }
          
          public void display(){
              node temp = head;
           while(temp!=null){
               System.out.print(temp.data + " ");
               temp = temp.next;
           }
           System.out.println();
            
          }
          
          public int peek(){
              return head.data;
          }
          
          public int remove(){
              int a = head.data;
               head = head.next;
              return a;
          }
      }
          
          

    public static void main(String args[]) {

        /*Queue<Integer> qu = new LinkedList<>();
        int a = 1;
        qu.add(a);
        qu.add(2);
        qu.add(3);
        int i = qu.peek();
        System.out.print(qu);*/
        //array implementation of Queue...
        /*arrayQueue queue = new arrayQueue();
        queue.add(0);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.display();
        System.out.println(queue.peek());
         System.out.println(queue.remove());
         queue.display();*/
        
        llqueue queue = new llqueue();
        queue.add(0);
         queue.add(1);
          queue.add(2);
           queue.add(3);
           queue.display();
           System.out.println(queue.peek());
            System.out.println(queue.remove());
           //queue.remove();
           queue.display();
           
           

    }
}
