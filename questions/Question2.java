package questions;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{1,5,9},
				     {2,6,10},
				     {3,7,11},
				     {4,8,12}};
		
		/*for(int i=0;i<a.length;i++) {
			for(int j=0;j<=a[i].length;j++) {
			System.out.print(a[j][i]);
			}
	}*/
		
		int[][] b = {{1,2,3},  //00 01 02
			        {4,5,6},  //10 11 12
			        {7,8,9}};  //20 21 22
		
	    int j =0; 
		for(int i=b.length-1;i>=0;i--) {
			j = 0;
			System.out.print(b[i][j]);
		  }
		
		int i=1;
		while(i<b.length) {
			System.out.print(b[i][i]);
			i++;
		}
		
		for(i=b.length-2;i>=0;i--) {
			j = b.length-1;
			System.out.print(b[i][j]);
		  }
		
		
	}

}

