package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n1 = scan.nextInt();
        System.out.print("Please enter another number: ");
        int n2 = scan.nextInt();
        System.out.printf("Average of %d and %d is %.1f.",n1,n2,(n1+n2)/2.0);
		

	}

}
