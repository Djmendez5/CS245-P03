
public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int[] temp = new int[a.length];
		int low = 0;
		int high = a.length-1;
		mergesort(a, temp, low, high);
	}
	static void mergesort(int[] a, int[] temp, int low, int high) {
		
		if (low >= high)
			return;
		
		int mid = (low + high) / 2;
		mergesort(a, temp, low, mid);
		mergesort(a,temp, mid + 1, high);
		merge(a, temp, low, mid, high);
}
static void merge( int[] a, int[] temp, int low , int mid, int high) {
	int k = low;
	int i = low;
	int j = mid + 1;
	while (k <= high) {
		if (i > mid) {
			temp[k] = a[j];
			k++;
			j++;
		}
		else if (j > high) {
			temp[k] = a[i];
			k++;
			i++;
		}
		else if (a[i] < a[j]) { 
			temp[k] = a[i];
			k++;
			i++;
		}
		else {
			temp[k] = a[j]; 
			k++;
			j++;
		}
	}
	
	for (k = low; k <= high; k++)
		a[k] = temp[k];

}
}