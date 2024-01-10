package Y4j;
import java.util.Scanner;
public class Increase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
				System.out.println(++a);
		System.out.println("The post increment is"+(a++));
		System.out.print(a++);
		System.out.println("The pre increment is"+(++a));
		System.out.println(++a); 
		System.out.println(" The post decrement is "+(a--));
			System.out.println(a--);
		System.out.println(" The pre decrement is "+(--a));
System.out.print(--a)	;	

	}

}
