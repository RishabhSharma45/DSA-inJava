package asg5;

public class Questions {
	
	static void circularTraversal(int[][] arr) {
		int j = 0;
		int i = arr.length-1;
		while(i>=0) {
			System.out.print(arr[i][j]);
			i--;
		}
		i=0;
		j++;
		while(j<arr[0].length) {
			System.out.print(arr[i][j]);
			j++;
		}
		i++;
		j--;
		while(i<arr.length) {
			System.out.print(arr[i][j]);
			i++;
		}
		i--;
		j--;
		while(j>0) {
			System.out.print(arr[i][j]);
			j--;
		}
		
		
	}
	
	static void spiralTraversal(int[][] arr) {
		int j = 0;
		int i = arr.length-1;
		while(i>=0) {
			System.out.print(arr[i][j]);
			i--;
		}
		i=0;
		j++;
		while(j<arr[0].length) {
			System.out.print(arr[i][j]);
			j++;
		}
		i++;
		j--;
		while(i<arr.length) {
			System.out.print(arr[i][j]);
			i++;
		}
		i--;
		j--;
		while(j>0) {
			System.out.print(arr[i][j]);
			j--;
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		circularTraversal(arr);
		
	}

}
