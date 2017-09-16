
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int low=0;
		int high = a.length-1;
		quicksort(a, low, high);
	}
	/*static void quicksort(int[] a, int low,int  high) {
		int pivot;
		if (low < high) {
			pivot = partition(a, low, high);
			quicksort(a, low, pivot - 1);
			quicksort(a, pivot + 1, high);
		}
	}*/
	static void quicksort(int a[], int low, int high)
    {
        if (low < high)
        {
            int pivot = partition(a, low, high);
            quicksort(a, low, pivot-1);
            quicksort(a, pivot+1, high);
        }
    }
 
	
	static int partition(int a[], int low, int high) {
		int pivot = a[high]; 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
            if (a[j] <= pivot)
            {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;
        return i+1;
	}


}
