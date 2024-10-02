package String;

public class String1 {
	

	public static void main(java.lang.String[] args) {
		// question 1
		/*String s ="physics";
		for(int i=2;i<4;i++) {
			System.out.println(s.substring(i));  //i included
		}*/
		
		//all the possible substring of string s
		// s = abcd , a , b, c , d, , ab , bc , cd , abc , bcd , abcd;
		/* String s1 = "abcd";
		 
		 int count = 1;
		 int i = 0;
		 int j = 1;
		 while(j<=s1.length()) {
			 int k = j;
			 while(j<=s1.length()) {
				 System.out.println(s1.substring(i,j)); 
				 i++;
				 j++;
			 }
			i=0;
			j = k+1;
			 
		 }*/
		 
		 //toggle a string
		 /*String s2 = "PhysICS";
		 //PhysICS   physics
		 //PhysICS   PHYSICS
		 String s3 = s2.toLowerCase();
		 String s4 = s2.toUpperCase();
		 String s5 = "";
		 for(int i=0;i<s2.length();i++) {
			 if(s2.charAt(i)==s3.charAt(i)) {
				 s5 = s5+s4.charAt(i);
			 }
			 else {
				 s5 = s5+s3.charAt(i);
			 }
		 }
      System.out.println(s5);*/
		
		//palindromic substring values
		
		/*String s1 = "abcd";
		 
		 int count = 0;
		 int i = 0;
		 int j = 1;
		 while(j<=s1.length()) {
			 int k = j;
			 while(j<=s1.length()) {
				 
				if(s1.substring(i,j).equals(new StringBuilder(s1.substring(i,j)).reverse().toString())){
					count++;
				}
				 i++;
				 j++;
			 }
			i=0;
			j = k+1;
			 
		 }
		 
		 System.out.println(count);*/
		
		// reverse each word in a string
		/*String s5 = "i am an xyz";
		String s6 = "";
		/*int i = 0;
		int j = 0;
		while(i<s5.length()) {
			char a = ' ';
			if(s5.charAt(i)== a) {
				s6 = s6+ new StringBuilder(s5.substring(j,i)).reverse().toString();
				j=i+1;
			}
		}*/
		/*System.out.println(s6);*/
		
		 //compress given string
		// aaabbcccccdde
		//a3b2c5d2e
		
		 

		 
		 
		 
	}

}






