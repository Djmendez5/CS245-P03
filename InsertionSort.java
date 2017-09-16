
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int temp;
		int j ;
		for(int i =1; i<a.length;i++) {
			temp=a[i];
			j = i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1] = a[j];
				j--;
			}
		a[j+1] = temp;
		}

	}

}
