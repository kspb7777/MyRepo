
import java.util.*;


class Exceptionarg
{
	
	void check(int a, int b)
	{
		int rslt=0;
		try
		{
		if (b==0)
		{
			throw new ArithmeticException();
			
		}
		else
		{
			rslt=a/b;
		}
		
		//int rslt1=a+b;
		
		System.out.println("result "+rslt);
		//System.out.println("result "+rslt1);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	
}

public class ThrowException {
	
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Exceptionarg obj1=new Exceptionarg();
		obj1.check(a, b);
		

	}

}
