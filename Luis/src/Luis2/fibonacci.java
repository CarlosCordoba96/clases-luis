package Luis2;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println("Recursivo: "+fibrec(10));
		System.out.println("Iterativo: "+fibite(10));

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
}
