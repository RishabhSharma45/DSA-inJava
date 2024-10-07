package sorting;

public class Sorting1 {
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
		/*
		 * 4 5 6 9 8 5 2 3
		 * 4 5 6 8 5 2 3 9 //last element will be at its pos...
		 * 4 5 6 5 2 3 8 9
		 * 4 5 5 2 3 6 8 9
		 * 4 5 2 3 5 6 8 9
		 * 4 2 3 5 5 6 8 9
		 * 2 3 4 5 5 6 8 9
		 * n-1 passes wil be there
		 */
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minindex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] > arr[minindex]) {
				minindex = j;
				}
				int temp = arr[i];
				arr[i] = arr[minindex];
				arr[minindex] = temp;
			}
			/*
			 * as in bubble sort in each phase last elemnt gots its place same in selection phase elements gets its first pos...
			 */
		}
	}
	
	
	public static void insertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			 int j = i;
			 while(j>0 && arr[j]<arr[j-1] ) {
				 int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					j--;
			 }
		}
		/*
		 * 6 2 3 5 1 4
		 * 2 6 3 5 1 4
		 * 2 3 6 5 1 4
		 * 2 3 6 1 5 4
		 * 2 3 1 6 5 4
		 * 2 1 3 6 5 4
		 * 1 2 3 6 5 4
		 * 1 2 3 6 5 4
		 * 1 2 3 4 5 6 
		 * 
		 */
	}
	
	//shifting zeroes at the end ..
	public static void question1(int arr[]) {
		// 8 0 6 5 0 0 7 4
		//
		// 8 5 6 4 7 0 0 0
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]==0) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
	}
	
	//lexographic order
	
	static void question2(String[] arr){
        for(int i=0;i<arr.length;i++){
            int minindex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[minindex])<0){
                    minindex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
    }
	
	
	
		
		public static void print(int[] arr) {
			for(int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	

	public static void main(String[] args) {
		int[] a = {4,5,6,9,8,5,2,3};
		int[] b = {5 , 0 ,8 ,7 ,0 ,1};
		//bubbleSort(a);
		//selectionSort(a);
		//insertionSort(a);
		question1(b);
		print(b);
		

	}

}
