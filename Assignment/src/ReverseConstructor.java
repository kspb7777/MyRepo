


class DisplayConstrutor
{	
	 int reverse1=0;
	 int reverse2=0;
	 

	DisplayConstrutor(int a)
	{
		while(a!=0)
		{
	
		int rev=a%10;
		reverse1=reverse1*10+rev;
		a/=10;
		
		}
	}
	
	DisplayConstrutor(int a, int b)
	{
		while(a!=0)
		{
	
		int rev=a%10;
		reverse2=reverse2*10+rev;
		a/=10;
		
		}
		while(b!=0)
		{
	
		int rev=b%10;
		reverse1=reverse1*10+rev;
		b/=10;
		
		}
	}
		void display()
		{
			System.out.println("parent display reverse "+reverse1);
		}
		void display1()
		{
			System.out.println("parent display 2 reverse"+reverse2);
		}
	
}
class ReverseNumber extends DisplayConstrutor
{
	
		
	public ReverseNumber(int a, int b)
	{
		
		//super(a);
		super(a,b);
		super.display();
		super.display1();
		//super();
		
		//System.out.println("Reverse of the number is "+reverse);
		
		
		//System.out.println("Reverse of the number is "+reverse);
	}
	
}

public class ReverseConstructor {

	public static void main(String[] args) {
		
		ReverseNumber obj1=new ReverseNumber(1421,1567);
		//DisplayConstrutor obj2=new DisplayConstrutor();
	}

}
