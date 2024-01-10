package Y4j;
import java.util.Scanner;
public class Modules {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fir num");
		int firnum=sc.nextInt();
		System.out.println("enter the sec num");
		int secnum=sc.nextInt();
		int mod=firnum%secnum;
		System.out.println("The Modules of "+firnum+ "and" +secnum+ "is" +mod);
		
	}
	

}
