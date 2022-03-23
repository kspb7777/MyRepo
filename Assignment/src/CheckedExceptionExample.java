import java.io.IOException;

class Calculator
{
	public int divide(int a, int b) 
	{
		return a/b;
	}
	
	
}






public class CheckedExceptionExample {

	public static void main(String[] args) {
		
		Calculator obj1=new Calculator();
		int c=obj1.divide(10,0);
		System.out.println("result "+c);
		

	}

}
