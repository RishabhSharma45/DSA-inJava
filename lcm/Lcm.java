package lcm;

import java.util.Arrays;

public class Lcm {
	
	int[] values ;
	int ans =0;
	
	Lcm(int... a){
		this.values = a;
		 Arrays.sort(values);
	}	
	
	public int gcd(int a , int b) {
		if(a%b==0) {
			return b;
		}
		return gcd(b,a%b);
	}
	
	public int comp(int a , int b) {
		int greater = 0;
		int smaller = 0;
		if(a>b) {
			greater = a;
			smaller = b;
		}
		else if(b>a) {
			greater = b;
			smaller = a;
		}
		else {
			greater = a;
			smaller = b;
		}
		
		return gcd(greater,smaller);
		
		
		
	}
	
	public int lcm(int n) {
		if(n==1) {
			return n;
		}
	
	return (lcm(n-1)*values[n-1]) / comp(lcm(n-1),values[n-1]);
		
	  //lcm = a*b/gcd
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lcm lcm1 = new Lcm(2,7,3,9,4);
		System.out.println(lcm1.lcm(5));

	}

}
