package test2;

import java.util.Scanner;

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
		
		 while(true)
	       {
	    	   System.out.println("Enter choice");
	    	   System.out.println("1.Register New Account\n2.Other\n3.Exit");
	    	   Integer choice1=Integer.parseInt(s.nextLine());
	    	   switch(choice1)
	    	   {
	    	   case 1:
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
	    		     
	    		     break;
	    	   case 2:
	    		   
	    			      while(true)
	    			      {
	    			   	   System.out.println("Enter choice");
	    			   	   System.out.println("1.withdraw\n2.Deposit\n3.BankStatement\n4.Exit");
	    			   	   Integer choice =Integer.parseInt(s.nextLine());
	    			   	   switch(choice)
	    			   	   {
	    			   	   
	    			   	   case 1:
	    			   		   System.out.println("Enter amount");
	    			   		   Double amt=Double.parseDouble(s.nextLine());
	    			   		   b.withdraw(amt);
	    			   		   break;
	    			   	   case 2:
	    			   		   System.out.println("Enter amount");
	    			   		   Double amt1=Double.parseDouble(s.nextLine());
	    			   		   b.deposit(amt1);
	    			   		   break;
	    			   	   case 3:
	    			   		   b.bankStm();
	    			   		   break;
	    			   	   case 4:
	    			   		   System.out.println("Exited successfully...");
	    			   		   System.exit(0);
	    			   		  
	    			   		   
	    			   	  default :
	    			   		  System.out.println("invalid...");
	    			   		  break;
	    			   			   
	    			   	   
	    			   	   }
	    			       }
	    			      
	    			     
	    		   
	    		  
	    		  
	    	   case 3:
	    		   System.out.println("Exited successfully....");
	    		   System.exit(0);
	    		   break;
	    	  default :
	    		  System.out.println("invalid  ......");
	    		  break;
	    			   
	    	   }
	       }
	       

	}

}
