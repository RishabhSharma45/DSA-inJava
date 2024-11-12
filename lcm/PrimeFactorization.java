package lcm;

public class PrimeFactorization {
	
	static int i = 2;
	
	static int lcd(int n) {
		while(i<=n) {
			if(n%i==0) {
				return i;
			}
			else if(i==n) {
				return n;
			}
			i++;
		}
		return 1;
	}

	static void primeFactor(int n) {
		if(n==1) {
			return;
		}
		System.out.print(lcd(n)+" ");
		primeFactor(n/lcd(n));
	}
	
	static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibonacci(n-2)+fibonacci(n-1);
	}
	
	public static void main(String args[]) {
		primeFactor(315);
		System.out.println(fibonacci(5));
	}
	
}
