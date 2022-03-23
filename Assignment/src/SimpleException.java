
public class SimpleException {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int d;
		try
		{
			
				d=a/b;
				//throw new ArithmeticException("exception handled");
			
			
		}
			catch(ArithmeticException e)
			{
				System.out.println("handled");
			}
			
			
		
				
		
		
		finally 
		{
		d=a/(b);
		System.out.println(d);
		}
		// TODO Auto-generated method stub

	}

}
