package programs;

public class SortingAlgorithms {

	public static void quickSort(int[] arr, int l_index, int r_index) {
		
		if(l_index >= r_index) {
			return; 
		}
		int pivot = arr[r_index];
		int lp = l_index;
		int rp = r_index;
		
		while(lp < rp) {
			while(arr[lp] <= pivot && lp < rp) {
				lp++;
			}
			
			while(arr[rp] >= pivot && lp < rp) {
				rp --;
			}
			swap(arr, lp, rp);
		}
		
		swap(arr, lp, r_index);
		
		quickSort(arr, l_index, lp-1);
		quickSort(arr, lp+1, r_index);
	}
	
	public static int[] swap(int[] arr, int lp, int rp) {
		int num = arr[lp];
		arr[lp] = arr[rp];
		arr[rp] = num;
		return arr;
	}
}
