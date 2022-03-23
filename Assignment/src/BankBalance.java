import java.util.*;
class BankOperation
{
	static int balance=100;
	Scanner sc1=new Scanner(System.in);
	
	 static void balance()
	{
		System.out.println(" Balance Amount is "+balance);
	}
	
	void withdrawal()
	{
		
		System.out.println(" Enter the amount to withdraw");
		int b=sc1.nextInt();
		
		if(b<BankOperation.balance)
		{
			BankOperation.balance=BankOperation.balance-b;
		}
		else
		{
			System.out.println(" YOU DONT HAVE ENOUGH BALANCE");
		}
		
	}
	
	void deposit()
	{
		
		System.out.println(" Enter the amount to Deposit ");
		int c=sc1.nextInt();
		BankOperation.balance=BankOperation.balance+c;
	}
	
	
}









public class BankBalance
{
	
	public  static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub

		int x=0;
	
		
		BankOperation obj1=new BankOperation();
		while(x!=4)
			
		{	
			
			System.out.println("1. withdrawal");
			System.out.println("2. Deposit");
			System.out.println("3.Balance");
			System.out.println("4.Quit");
			Scanner sc=new Scanner(System.in);
			x=sc.nextInt();
		switch(x)
		{
		case 1:
		obj1.withdrawal();break;
		case 2:
		obj1.deposit();break;
		case 3:
			BankOperation.balance();
			break;
				
		}
		}
	}
}
		
			
		
