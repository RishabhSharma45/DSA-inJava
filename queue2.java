/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.prahar;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue2 {
    
    public static Queue<Integer> reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(queue.size()!=0){
            stack.push(queue.remove());
            
        }
        while(stack.size()!=0){
            queue.add(stack.pop());
        }
        return queue;
    }
    
   public static class stack{
       Queue<Integer> queue = new LinkedList<>();
       public void push(int i){
           queue.add(i);
       }
       public int peek(){
           int a = queue.peek();
           int b= 0;
            queue.add(queue.remove());
            
          while(queue.peek()!=a){
              b = queue.peek();
               queue.add(queue.remove());
          }
           
           return b;
       }
       
       public int pop(){
           int a = queue.peek();
           int b= peek();
            queue.add(queue.remove());
          while(queue.peek()!=b){
               queue.add(queue.remove());
          }
           queue.remove();
           return b;
       }
       
       public void display(){
           System.out.println(queue);
       }
   }
   
   public static class queue{
       Stack<Integer> st = new Stack();
       public void add(int i){
           st.push(i);
       }
       public int peek(){
            Stack<Integer> st2 = new Stack();
           while(st.size()!=1){
               st2.push(st.pop());
           }
              int i = st.peek();
              while(st2.size()!=0){
                  st.push(st2.pop());
              }
           return i ;
       }
       public int remove(){
           Stack<Integer> st2 = new Stack();
           while(st.size()!=1){
               st2.push(st.pop());
           }
              int i = st.pop();
              while(st2.size()!=0){
                  st.push(st2.pop());
              }
           return i ;
       }
        public void display(){
           System.out.println(st);
       }
}
    
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(reverse(queue));
        
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
        
        queue qu = new queue();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.display();
        System.out.println(qu.peek());
        qu.remove();
        qu.display();
        
    }
}
