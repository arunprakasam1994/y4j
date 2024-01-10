package Y4j;
import java.util.Scanner;
public class Addition{
		public static  void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int firstnumber=sc.nextInt();
			System.out.println("enter the Second number");
		int secondnumber=sc.nextInt();
		int sum=firstnumber+ secondnumber;
			System.out.println("The sum of "+ firstnumber+  " and " +secondnumber+ " is " + sum);
	}
}
