
import java.util.Scanner;


public class Problem2 {
    public static void main(String[] args) {
		
		Scanner kb =new Scanner(System.in);
		int a = kb.nextInt();
		int b=1;
		while(a!=0) {
	
			System.out.println(b);
			b+=2;
			a--;
		}
	}

}
