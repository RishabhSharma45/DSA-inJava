package dsa.prahar;


public class stack {
    public static class arraystack{
      public static int[] arr = new int[10];
      public static int i = 0;
      
        public static void push(int a){
            arr[i] = a;
            i++;
        }
        
        public static void display(){
           for(int i=0;i<arr.length;i++){
               if(arr[i]!=0){
               System.out.print(arr[i] + " ");
               }
           }
           System.out.println();
        }
        
        public static void peek(){
            
            System.out.println(arr[i-1]);
        }
        
         public static void pop(){
            arr[i-1] = 0;
            i--;
        }
         
         public static void isEmpty(){
             if(i==0){
                 System.out.println("Stack is Empty");
             }
             else{
                 System.out.println("Stack is not empty");
             }
         }
        
    }
    
   public static class linkedlist{
        public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
        public static Node head = null;
        public static Node tail = null;
        
        public static void push(int data){
            Node temp = new Node(data);
            if(head==null){
                head = temp;
            }
            else{
                  tail.next = temp;
              }
              tail = temp;
        }
        public static void peek(){
           
           System.out.println(tail.data);
        }
        public static void pop(){
            Node temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            temp.next = tail.next;
            tail = temp;
        }
        public static void isEmpty(){
            if(head==null){
                System.out.println("Stack is Empty");
            }
            else{
                System.out.println("Stack is not Empty");
            }
        }
        public static void display(){
            Node temp  = head;
            while(temp!=null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    
   }
    
    public static void main(String args[]){
        /*arraystack st = new arraystack();
        st.push(1);
         st.push(2);
         st.push(3);
         st.display();
         st.peek();
         st.pop();
         st.peek();
         st.display();
         st.isEmpty();*/
        
        linkedlist st = new linkedlist();
        st.push(1);
         st.push(2);
          st.push(3);
           st.push(4);
        st.display();
        st.peek();
        st.pop();
        st.peek();
        st.isEmpty();
        
    }
}
