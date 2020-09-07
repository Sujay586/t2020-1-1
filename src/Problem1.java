
import java.util.Scanner;


public class Problem1 {
 public static void main(String[] args) {
double a;double b;String type_of_operation;
Scanner kb =new Scanner(System.in);
 a = kb.nextDouble(); b = kb.nextDouble(); type_of_operation = kb.next();

switch (type_of_operation) {
case "+" : 
	System.out.println(a+b);
	break;
case "-" : 
	System.out.println(a-b);
	break;
case "*" : 
	System.out.println(a*b);
	break;
case "/" : 
	System.out.println(a/b);
	break;

default:
	throw new IllegalArgumentException("Unexpected value: " + type_of_operation);
	
}


}   
}
