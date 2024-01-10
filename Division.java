package Y4j;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Firstnumber");
		int firstnum=sc.nextInt();
		System.out.println("enter the Second number");
		int secnum=sc.nextInt();
		int div=firstnum/secnum;
		System.out.println("The Division of "+firstnum+ "and"+secnum+ "is" +div);
	}

}
