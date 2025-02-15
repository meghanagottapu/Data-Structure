public class MaxHeap {
	private int[] arr;
	private int size;
	public MaxHeap(int[] keys){
		arr = keys;
		size = arr.length;
	}
//	prints the initial array
	public void print() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
//	returns the parent index of given index	
	int parent(int i) {
		if(i >= 0 && i < size) return (i-1)/2;
		else return -1;
	}
	int get(int i) {
		if(i>=0 && i<size) return arr[i];
		else return -1;
	}
//	returns the left index of given index
	int left(int i) {
		int x = 2*i+1;
		if(x < size) return x;
		else return -1;
	}
//	returns the right index of given index
	int right(int i) {
		int x = 2*i+2;
		if(x < size) return x;
		else return -1;
	}
//	stringify the object
	public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(arr[0]);
        for (int i=1; i< size; i++)
            sb.append(" " + arr[i]);
        //sb.append("\n");
        return sb.toString();
    }

	int checkProperty(int i) {
		int largest = i;
		int l = left(i);
		int r = right(i);
		if(l!=-1 && arr[l]>arr[i]) largest = l;
		else largest = i;
		if(r!=-1 && arr[r]>arr[largest]) {
			largest = r;
		}
		return largest;
	}
	void buildheap() {
		int n = size;
		for(int i=(n-2)/2; i>=0; i--) {
			fixheap(i);
		}
	}
	void fixheap(int i) {
		int j = checkProperty(i);
		if(i==j) return;
		else {
			exchange(i,j);
			fixheap(j);
			
		}
	}
	void exchange(int i,int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	void check_final() {
		int n = size;
		int count = 0;
		for(int i=0;i<(n-1)/2;i++) {
			if(checkProperty(i) != i) count++;
		}
		if(count == 0) System.out.println("Fixed :)");
		else System.out.println("Still old :(");
	}
	int extractMax() {
		int val = arr[0];
		arr[0] = arr[size-1];
		fixheap(0);
		size--;
		return val;
	}
}
