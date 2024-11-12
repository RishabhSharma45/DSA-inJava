package questions;

public class Question1 {
	
	static int factorial(int num) {
		
		if(num==1) {
			return num;
		}
		
		// 5*4!
		return num*factorial(num-1);
	}
	
	static boolean strongNumber(int num) {
		
		//135 = 1! + 3! + 5!....=1+6+120=127
		
		int fact = 0;
		int n = 0;
		while(num>=10) {
		 n = num%10;
		fact = fact + factorial(n);
		num = num/10;
	}
		if(num>0 && num<=9) {
			fact = fact + factorial(num);
		}
		
		if(fact==num) {
			return true;
		}
		
		System.out.println(fact);
		return false;
		
	}
	
	static int pow(int p , int q) {
		if(q==1) {
			return p;
		}
		return p*pow(p,q-1);
	}
	
	static int findQ(int num) {
		
		//135 .
		int n = 0;

		while(num>=10) {
			n = n+1;
			num = num/10;
			
		}
		
		if(num>0 && num<=9) {
			n = n+1;
		}
		
		return n;
	}
	
	static boolean armstrongNumber(int num) {
		// 135 - 1^3 + 3^3 + 5^3 = 3+27+125=155
		
		int ans = 0;
		int p = 0;
		int q = findQ(num);
		
		while(num>=10) {
			p = num%10;
			ans = ans+ pow(p,q);
			num = num/10;
		}
		
		if(num>0 && num<=9) {
			ans = ans + pow(num,q);
		}
		
		System.out.println(ans);
		return false;
		
	}
	
	
	int reverse(int num) {
		return num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(armstrongNumber(135));
		System.out.println(strongNumber(135));

	}

}
