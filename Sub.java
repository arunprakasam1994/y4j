package Y4j;
import java.util.Scanner;
public class Sub {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int firnum=sc.nextInt();
		System.out.println("enter the second number");
		int secnum=sc.nextInt();
		int sum=firnum+secnum;
		int sub=firnum-secnum;
		int mul=firnum*secnum;
		int div=firnum/secnum;
		int mod=firnum%secnum;
		System.out.println("The addition of"+firnum+"and "+secnum+"is"+sum);
		System.out.println("The subtraction of"+firnum+"and "+secnum+"is"+sub);
		System.out.println("The multiplication of"+firnum+"and "+secnum+"is"+mul);
		System.out.println("The division of"+firnum+"and "+secnum+"is"+div);
		System.out.println("The modules of"+firnum+"and "+secnum+"is"+mod);

	}

}
