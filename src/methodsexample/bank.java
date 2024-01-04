package methodsexample;

public class bank {
	private int variablebalance=5000;
	private int deposit=2000;
	private int withdraw=3000;
	public void withdrawl()
	{
		int withdrawlamt=variablebalance-withdraw;
		System.out.println(" after withdraw current balance in my account" +  withdrawlamt);
	}
	 public void depositmoney()
	{
		int amtdeposit=variablebalance+deposit;
		System.out.println("deposit the amount" +  amtdeposit);
	}
	public void balance_checking()
	{
	  int balance=(variablebalance+deposit-withdraw);
		System.out.println("remaining balance after withdraw" +  balance);
	}
	public static void main(String[] args) {
		bank b1=new bank();
		b1.withdrawl();
		b1.depositmoney();
	
		b1.balance_checking();
	}
	}


