package Y4j;
 import java.util.Scanner;
public class Subtraction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstnumber=sc.nextInt();
		System.out.println("Enter the second number");
		int secondnumber=sc.nextInt();
		int sub= firstnumber-secondnumber;
		System.out.println("The subtraction of" +firstnumber+ "and" +secondnumber+"is" +sub);
	}
}