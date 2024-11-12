package asg6;

public class Questions {
	
	static void zigZagPattern(int[][] arr) {
		int i = 0;
		int j =0;
		while(i<arr.length) {
			if(j==0) {
			while(j<arr[i].length) {
				System.out.print(arr[i][j] +" ");
				j++;
			}
			--j;
			i++;
			}
			else {
				while(j>=0) {
					System.out.print(arr[i][j] +" ");
					j--;
				}
				i++;
				j=0;
				
			}
		}
	}
		
		static void swastiKSum(int[][] arr) {
			int i = arr.length/2;
			int j = arr[0].length/2;
			int count = 0;
			int k =0;
			while(k<arr.length) {
				count = count + arr[k][j] + arr[i][k];
				k++;
			}
			count = count - arr[i][j];
			k=0;
			j = 0;
			int mid = i;
			while(k<mid) {
				count = count + arr[k][j];
			  k++;
			}
			k=arr.length-1;
			i = 0;
			while(k<mid) {
				count = count + arr[i][k];
			  k--;
			}
			k=0;
			i = arr.length-1;
			while(k<mid) {
				count = count + arr[k][i];
			  k++;
			}
			k=arr.length-1;
			j = arr.length-1;
			while(k<mid) {
				count = count + arr[k][j];
			  k--;
			}
			System.out.println(count);
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},
				        {5,6,7,8},
				        {9,10,11,12},
				        {13,14,15,16}};
		
		int[][] arr1 = {{1,1,1,1,1},
		        {1,1,1,1,1},
		        {1,1,1,1,1},
		        {1,1,1,1,1},
		        {1,1,1,1,1}};
		
		zigZagPattern(arr);
		System.out.println();
		swastiKSum(arr1);

	}

}
