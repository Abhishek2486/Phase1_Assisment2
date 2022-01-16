package Arthmeticoperation;
import java.util.Scanner;

public class artmeticCalucator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first number");
	double a=sc.nextDouble();
	System.out.println("enter the second number");
	double b=sc.nextDouble();
	System.out.println("enter the operator +,-,*,/");
	char opt=sc.next().charAt(0);
	sc.close();
	double output;
	switch(opt) {
	case '+':
	output=a+b;
	break;
	case '-':
	output=a-b;
	break;
	case'*':
		output=a*b;
		break;
	case'/':
	output=a/b;
	break;
	default:
		System.out.println("you entered wrong number");
		return;
	}
	System.out.println(a+" "+opt+" "+b+ "=" +output);
	}
	
	
}

