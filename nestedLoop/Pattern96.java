package nestedLoop;

public class Pattern96{

	public static void main(String[] args) {
		int n = 6;
		
		int[] b = new int[n];
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			int sum=0;
			int k = 0;
			int l = k;
			for(int j=0;j<i+1;j++) {
				if(j==0 || j==i) {
					System.out.print(1+" ");
					b[j] = 1;
				}else {
					while(k<l+2) {
						sum+=a[k];
						k+=1;
					}
					k+=1;
					l=k;
					System.out.print(sum+" ");
					b[j] = sum;
				}
			}
			System.out.println();
			for(int j=0;j<i+1;j++) {
				a[j]=b[j];
			}
		}
	}

}
