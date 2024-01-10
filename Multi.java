package Y4j;
import java.util.Scanner;
public class Multi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int firstnum=sc.nextInt();
		System.out.println("enter the second number");
		int secnum=sc.nextInt();
		int mul=firstnum*secnum;
		System.out.println("The multiplication "+firstnum+"and"+secnum+"is"+mul);
	}

}
