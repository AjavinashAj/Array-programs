package test2;

public class Bank {
	  private static String bName;
	  private static String bBName;
	  private static String bIfc;
	 private Long accNum;
	 private String accHName;
	 private Double bal;
	 private String pasword;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bank(Long accNum, String accHName, Double bal, String pasword) {
		super();
		this.accNum = accNum;
		this.accHName = accHName;
		this.bal = bal;
		this.pasword = pasword;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

	public static String getbName() {
		return bName;
	}

	public static void setbName(String bName) {
		Bank.bName = bName;
	}

	public static String getbBName() {
		return bBName;
	}

	public static void setbBName(String bBName) {
		Bank.bBName = bBName;
	}

	public static String getbIfc() {
		return bIfc;
	}

	public static void setbIfc(String bIfc) {
		Bank.bIfc = bIfc;
	}

	public Long getAccNum() {
		return accNum;
	}

	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}

	public String getAccHName() {
		return accHName;
	}

	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}

	public Double getBal() {
		return bal;
	}

	public void setBal(Double bal) {
		this.bal = bal;
	}

	public void bankStm()
	{
		System.out.println(bName+" "+bBName+" "+bIfc+" "+accNum+" "+accHName+" "+bal);
	}
	public void deposit(double amt)
	{
		if(amt>0)
		{
		bal=bal+amt;
		System.out.println(bal+":deposit successfully....");
		}
		else
		{
			System.out.println("invalid amount.....");
		}
		
	}
	public void withdraw(double amt)
	{
		if(amt<bal)
		{
			bal=bal-amt;
			System.out.println(amt+":withdraw successfully...");
			System.out.println(bal+":remaining amout");
		}
		else
		{
			System.out.println("invalid amount...");
		}
	}
	
	

}
