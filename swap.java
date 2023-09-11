/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=scanner.nextInt();
		System.out.println("Enter the second number:");
		int b=scanner.nextInt();
		System.out.println("Before swapping a="+ a);
		System.out.println("b="+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a="+ a);
		System.out.println("b="+ b);
	
	}
}