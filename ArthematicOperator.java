package Y4j;
import java.util.Scanner;
public class ArthematicOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int firnum=sc.nextInt();
		System.out.println("Enter the Second Number");
		int secnum=sc.nextInt();
		int add=firnum+secnum;
		int sub=firnum-secnum;
		int mul=firnum*secnum;
		int div=firnum/secnum;
		int mod=firnum%secnum;
		System.out.println("The Addition of " + firnum+ "and " +secnum+ "is"+add);
		System.out.println("The Subtraction of"+firnum+"and"+secnum+"is"+sub);
		System.out.println("The Multiplication of"+firnum+" and "+secnum+"is"+mul);
		System.out.println("The Division of "+firnum+"and"+secnum+"is" +div);
		System.out.println("The Modules of "+firnum+"and"+secnum+"is" +mod);

	}

}
