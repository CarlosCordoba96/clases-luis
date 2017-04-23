package Luis2;

import java.util.Arrays;

public class fibonacci {

	public static void main(String[] args) {
		int [] m={1,2,3};
		int []arr2={4,3,2};
		imprim(m);
		
		reverse(m);
		imprim(m);
		
		imprim(arr2);
		Arrays.sort(arr2);

		imprim(arr2);

	}
	
	static void reverse(int[] data) {
		Arrays.sort(data);
	    for (int left = 0, right = data.length - 1; left < right; left++, right--) {
	        // swap the values at the left and right indices
	        int temp = data[left];
	        data[left]  = data[right];
	        data[right] = temp;
	    }
	}
	
static int fibite(int n){
	int vec[]=new int[n+1];
	int i;
	for(i=0;i<vec.length;i++){
		if(i<=1){
			vec[i]=i;
		}else{
			vec[i]=vec[i-2]+vec[i-1];
		}
	}
	return vec[n];
}
	
	static  int fibrec(int n){
		if(n<=1){
			return n;
		}
		else{
			return fibrec(n-1)+fibrec(n-2);
		}
	}
	static void imprim(int[] m){
		for(int i=0;i<m.length;i++){
		System.out.print(m[i]+" ");
			
		}
		System.out.println();
	}
}
