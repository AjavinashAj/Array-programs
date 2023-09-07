package test3;

import java.util.Scanner;

import test2.Bank;

public class App {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Bank b=new Bank();
		System.out.println("Enter Bank Name");
		b.setbBName(s.nextLine());
		System.out.println("Enter Bank Branch Name");
		b.setbBName(s.nextLine());
		System.out.println("Enter Bank ifsc code");
		b.setbIfc(s.nextLine());
		
		 
		 System.out.println("Enter no.of account you want to register");
		   int n=Integer.parseInt(s.nextLine());
		   Bank[] bk=new Bank[n];
		    for(int i=0;i<n;i++)
		    {
		    	System.out.println(" =========Register:"+(i+1)+"account========");
		    	System.out.println("Enter acc holder name");
		    	String ac=s.nextLine();
		    	System.out.println("Enter acc number");
		    	Long acn=Long.parseLong(s.nextLine());
		    	System.out.println("Enter Password");
		    	String pw=s.nextLine();
		    	System.out.println("Enter Balance");
		    	Double ba=Double.parseDouble(s.nextLine());
		    	bk[i]=new Bank(acn,ac,ba,pw);
		    	System.out.println("Bank "+(i+1)+"register successfully....");
		    }
		    for(Bank k:bk)
		    {
		    	System.out.println("==========Account drtails==========");
		    	System.out.println(k.getAccHName()+"\n"+k.getAccNum()+"\n"+k.getPasword()+"\n"+k.getBal()+"\n"+k.getbBName()+"\n"+k.getbIfc());
		    }
		    b.bankStm();
		    b.deposit(200);
		    b.withdraw(400);
	       

	}

}
