package may23_2023;

import java.util.Scanner;

public class Calculator_Application {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true)
		{
		  System.out.println("=============================Enter Your choice=====================\n1.Add\n2.Sub\n3.Mul\n4.Div\n5.Exit");
			int choice=s.nextInt();
			switch(choice) 
			{
			case 1:
				System.out.println("Enter First Number");
				int a=s.nextInt();
				System.out.println("Enter Second Number");
				int b=s.nextInt();

				 System.out.println("Add:"+(a+b));
				 break;
				 
			case 2:
				System.out.println("Enter First Number");
				int a1=s.nextInt();
				System.out.println("Enter Second Number");
				int b1=s.nextInt();

				 System.out.println("Sub:"+(a1-b1));
				 break;
			case 3:
				System.out.println("Enter First Number");
				int a2=s.nextInt();
				System.out.println("Enter Second Number");
				int b2=s.nextInt();

				  System.out.println("Mul:"+(a2*b2));
				  break;
			case 4:
				System.out.println("Enter First Number");
				int a3=s.nextInt();
				System.out.println("Enter Second Number");
				int b3=s.nextInt();

				  System.out.println("Div:"+(a3/b3));
				  break;
			case 5:
				System.out.println("Exit Successfully....");
				System.exit(0);
				break;
			default:
				 System.out.println("invalid data....");
				break;
			}
		}

	}

}
