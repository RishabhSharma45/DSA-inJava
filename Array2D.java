package array;

public class Array2D {
	
	//array addition + multiplication
	
	public static int[][] arrayAddition(int[][] a , int[][] b) {
 	   int row = a.length;
 	   int col = a[0].length;
 	   int[][] c = new int[row][col] ;
 	   for(int i=0;i<row;i++) {
 		   for(int j=0;j<col;j++) {
 			   c[i][j] = a[i][j] + b[i][j];
 		   }
 	   }
		return c;
 	   
    }
	
	public static int[][] arrayMultiplication(int[][] a , int [][] b ){
		int row = a.length;
		int col = a[0].length;
		int col2 = b[0].length;
		int[][] c = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col2;j++) {
				for(int k=0;k<col;k++) {
				c[i][j] += a[i][k] + b[k][j];
				}
			}
		}
		return c;
	}
	
	//array transpose
	
	 public static void arrayTranspose(int[][] a) {
  	   int row = a.length;
  	   int col = a[0].length;
  	   for(int i=0;i<row;i++){
  		   for(int j=i+1;j<col;j++) {
  			   if(i!=j) {
  				  int temp = a[i][j];
  				  a[i][j] = a[j][i];
  				  a[j][i] = temp;
  			   }
  		   }
  	   } 
     }
	 
	 //reverse inplace
	 public static void reverseArray(int[] a) {
		int i = 0;
		 int j = a.length-1;
		 while(i<j) {
			 int temp = a[i];
			 a[i] = a[j];
			 a[j] = temp;
		 }
	 }
	 
	 //rotation of array -- transpose + reverse
	 public static void rotationArray(int[][] a) {
		 arrayTranspose(a);
		 for(int i=0;i<a.length;i++) {
			 reverseArray(a[i]);
		 }
	 }
	 
	 
		// pascal's array
	
	 //print
	public static void print(int[][] a) {
		int row = a.length;
		int col = a[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2} , 
				     {3,4}};  // 
		int[][] b = {{1,2} ,
				     {3,4}};  // 
		int[][] sum = arrayAddition(a,b);
		print(sum);
		System.out.println();
		int[][] mul = arrayMultiplication(a,b);
		print(mul);
		System.out.println();
		arrayTranspose(a);
		print(a);
		
		System.out.println();
		rotationArray(b);
		print(b);
		

	}

}
