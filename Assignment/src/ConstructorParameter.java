

class Constructor
{
	Constructor()
	{
		System.out.println(" Total value using Parameterised Constructor");
	}
	Constructor(int value1, int value2,int value3)
	{
		int total=value1+value2+value3;
		System.out.println(" Total "+total);
		
	}
	
}







public class ConstructorParameter {

	public static void main(String[] args) {
		Constructor obj2=new Constructor();
		Constructor obj1=new Constructor(10,11,12);
		
		// TODO Auto-generated method stub

	}

}
