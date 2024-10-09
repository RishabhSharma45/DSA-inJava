package sorting;

public class Sorting2 {
	
	public static void mergeSort(int[] arr,int l , int r) {
		if(l>=r) return;
		int mid = (l+r)/2;
		mergeSort(arr , l , mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,mid,r);
	}
	
	public static void merge(int[]arr , int l , int mid , int r) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		int[] a1 = new int[n1];
		int [] b1 = new int[n2];
		for(int i=0;i<n1;i++) a1[i] = arr[l+i];
		for(int j=0;j<n2;j++) b1[j] = arr[mid+1+j];
		int i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(a1[i]<b1[j]) {
				arr[k++] = a1[i++];
			}
			else {
				arr[k++] = b1[j++];
			}
		}
		while(i<n1) {
			arr[k++] = a1[i++];
		}
		while(j<n2) {
			arr[k++] = b1[j++];
		}
	}
	
	 public static int partition(int[] arr , int st , int end){
         int pivot = arr[st];
         int count = 0;
         for(int i=st+1;i<=end;i++){
             if(arr[i]<=pivot){
                 count++;
             }
         }
         int pivotidx = st + count;
         int temp = arr[st];
         arr[st] = arr[pivotidx];
         arr[pivotidx] = temp;
         int i=st;
         int j=end;
         while(i<pivotidx && j>pivotidx){
             while(arr[i]<=pivot)i++;
             while(arr[j]>pivot)j--;
             if(i<pivotidx && j>pivotidx){
               int temp1 = arr[i];
         arr[i] = arr[j];
         arr[j] = temp1;  
         i++;
         j--;
             }
         }
         return pivotidx;
     }
	 
	  public static void quicksort(int[] arr , int st , int end){
          if(st>=end) return;
          int pi = partition(arr,st,end);
          quicksort(arr,st,pi-1);
          quicksort(arr,pi+1,end);
      }
	
	public static void print(int[] arr) {
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6,8,2,5,1,7,9};
		//mergeSort(arr,0,arr.length-1);
		quicksort(arr,0,arr.length-1);
		print(arr);

	}

}
