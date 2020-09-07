
import java.util.Scanner;


public class Problem4 {
    public static void main(String[] args) {
		
		Scanner kb =new Scanner(System.in);
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]=new int[12];
		for(int k=0;k<b.length;k++) {
			b[k]=kb.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int r=-1;
			for(int k=0;k<b.length;k++) {
			if(b[k]%a[i]==0) {
				r++;
			
			}
					}
			System.out.println(a[i]+":"+r);
			System.out.println();
		
	}
}
}
