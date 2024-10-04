package recursion;

import java.util.Arrays;
import java.util.List;

public class Recursion1 {
	
	// Print natural no. from 1 to n and n to 1
	public static void printNaturalNum(int n) {
		//8 1-7 + 8
		if(n==0) {
			return;
		}
		printNaturalNum(n-1);
		System.out.println(n);
	}
	
	//n to 1
	public static void printNaturalNumReverse(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNaturalNumReverse(n-1);
	}

	//factorial of n
	public static int factorial(int n) {
		//5 5*4
		if(n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	//fibonacci no.
	public static int fibonacci(int n) {
		// 0 1 1 2 3 5 8 13
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	//sum of digits of an Integer
	public static int sumOfDigits(int n) {
		// 1235 11
		if(n>=0 && n<=9) {
			return n;
		}
		return n%10+sumOfDigits(n/10);
	}
	
	//p to the power of q
	public static int powerOf(int p , int q) {
		// 2^5  2*2^4
		if(q==1) {
			return p;
		}
		return p*powerOf(p,q-1);
	}
	
	//sum of natural no
	public static int sumOfNaturalNum(int n) {
		//1+2+3+4++5 15
		if(n==0) {
			return 0;
		}
		return n+sumOfNaturalNum(n-1);
		
	}
	
	//Sum of order ?
	
	//k multiples of a no. n
	public static void kMultipleOfNumberN(int n , int k) {
		//2 4 6 8 10
		if(k==0) {
			return;
		}
		kMultipleOfNumberN(n,k-1);
		System.out.println(n*k);
	}
	
	//gcd
	public static int gcd(int n1 , int n2) {
		//  60 40  60/40 40/20 20
		// 60 = 40*q+r 60%40
		if(n1%n2==0) {
			return n2;
		}
		return gcd(n2,n1%n2);
		
	}
	
	//array print sum max and reverse
	public static void printArray(int[] a , int length) {
		// 1 2 3 4 5 6
		if(length==0) {
			return;
		}
		printArray(a,length-1);
		System.out.print(a[length-1] +" ");
	}
	
	//sum
	int sum = 0;
	public static int arraySum(int[] a , int length) {
		// 1 2 3 4 5 6
		if(length==1) {
			return a[0];
		}
		return a[length-1] + arraySum(a,length-1);
	}
	
	//max
	public static int arrayMax(int[] a , int length) {
		// 1 2 3 4 5 6
		Arrays.sort(a);
		return a[length-1];
	}
	
	//reverse
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//printNaturalNum(10);
		//printNaturalNumReverse(10);
		//System.out.println(factorial(5));
		//System.out.println(fibonacci(5));
		//System.out.println(sumOfDigits(1235));
		//System.out.println(powerOf(2,5));
		//System.out.println(sumOfNaturalNum(5));
		//kMultipleOfNumberN(2,5);
		//System.out.println(gcd(60,50));  // 60/50  50/10 0
		int[] a = {1,2,3,4,5,6,7};
        // printArray(a,5);
		System.out.println(arraySum(a,7));
		System.out.println(arrayMax(a,7));
	}

}
