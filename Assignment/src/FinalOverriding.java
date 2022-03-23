

class A
{
	int a=10;
	
	final void setdata()
	{
		System.out.println("value of a is "+ a);
	}
}
class B extends A
{
	
}




public class FinalOverriding {

	public static void main(String[] args) {
		
		B obj1=new B();
		obj1.setdata();
		
		// TODO Auto-generated method stub

	}

}
