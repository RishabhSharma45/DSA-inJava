package array;

import java.util.Arrays;

public class Day1 {
	
	/*
	 * What is array? its types? memory allocation Stack and Heap?
	 * traversal through for each loop?
	 * take array and initialize it?
	 */
	
	String name ;
	
	
	Day1(String name){
		this.name = name;
	}
	
	public static void changeValue(int x) {
		x = 20;
	}
	
	public static void changeName(Day1 newname) {
		newname.name = "max";
	}
	
	 public static void formalpara(String msg , String name) { //formal parameter
		   System.out.println(msg+" "+name);
		   
		  
	   }
	 
   public static void main(String args[]){
	   /*formal and actual parameters
	     formal parameters are method defination whereas actual parameters are are values pased during method invocation... 
	    */
	             //String msg="hello",name="xyz";
	             // formalpara(msg,name);//actual parameter
	     
	     /*
	      * pass by value means new variable bn jata hai memory where refrence me uska address share ho jata hai jaha pe koi bhi change karo to relect ho jata hai
	      java me jitne bhi data types bagera hai in sb me pass by value hota hai vahi objects ka pass by reference hota hai...
	      */
	   /* int x = 10;
	    changeValue(x);
	    System.out.println(x);
	    
	    Array1 a1 = new Array1("hello");
	    changeName(a1);
	    System.out.println(a1.name);*/
	   
	   //copy of arrays
	   int[] a = {1,2,3,4,5};
	   int[] b = a; // shallow copy
	  
	   for(int a1 : a) {
	   System.out.print(a1);
	   }
	   System.out.println();
	   for(int a1 : b) {
		   System.out.print(a1);
		   }
	   System.out.println();
	   b[1] = 5;
	   for(int a1 : a) {
		   System.out.print(a1);  // reflect is visible in a as well where as i make changes in b
		   }
	   System.out.println();
	   
	   int[] c = Arrays.copyOf(a, 8);
	   for(int a1 : c) {
		   System.out.print(a1);  
		   }
	   System.out.println();
	   c[1] = 8;
	   for(int a1 : a) {
		   System.out.print(a1); // deep copy no chane reflect in a
		   }
	   System.out.println();
	   for(int a1 : c) {
		   System.out.print(a1);  
		   }
	   
	   
	   
	   }
   
       //deep copy use predefine methods //cloning..
        //int[] c = a.clone();
   
    
        
}
 