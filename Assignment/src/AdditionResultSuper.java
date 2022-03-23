
class Addition
{
	int result;
	
	int calc(int a, int b)
	{
		result=a+b;
		return result;
	}
	
}

class Divisible extends Addition
{
	Divisible(int a, int b)
	{
		int c=super.calc(a, b);
		System.out.println("additon result"+c);
		int bal=c%10;
		if(bal==0)
		{
			System.out.println("divisble");
		}
		else
		{
			System.out.println("not divisible");
		}
		
	}
	
}


public class AdditionResultSuper {

	public static void main(String[] args) {
		
		Divisible obj1=new Divisible(10,21);
		

	}

}
