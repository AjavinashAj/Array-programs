package test;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
      Bank b=new Bank();
       while(true)
       {
    	   System.out.println("Enter choice");
    	   System.out.println("1.Register New Account\n2.Login account\n3.Exit");
    	   Integer choice1=Integer.parseInt(s.nextLine());
    	   switch(choice1)
    	   {
    	   case 1:
    		     System.out.println("Enter AccHolder Name");
    		     b.setAccHName(s.nextLine());
    		     System.out.println("Enter Bank Name");
    		     b.setbName(s.nextLine());
    		     System.out.println("Enter Bank Branch Name");
    		     b.setbBName(s.nextLine());
    		     System.out.println("Enter Bank IFSC code");
    		     b.setbIfc(s.nextLine());
    		     System.out.println("Enter Account Number");
    		     b.setAccNum(Long.parseLong(s.nextLine()));
    		     System.out.println("Enter Balance");
    		     b.setBal(Double.parseDouble(s.nextLine()));
    		     System.out.println("Enter Password");
    		     b.setPasword(s.nextLine());
    		     System.out.println("Bank register successfully....");
    		     break;
    	   case 2:
    		   System.out.println("Enter Account Number");
    		   Long ac=Long.parseLong(s.nextLine());
    		   System.out.println("Enter password");
    		   String pasw=s.nextLine();
    		   if(ac.equals(b.getAccNum()) && pasw.equals(b.getPasword()))
    		   {
    			   System.out.println("Login succesfully...");
    			   
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
    			      
    			     
    		   }
    		   else
    		   {
    			   System.out.println("invalid data....");
    		   }
    		   break;
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
