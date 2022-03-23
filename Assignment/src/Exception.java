
public class Exception {

	public static void main(String[] args) {
		
		
		int a[] ={1,2,3,4,5};
		
		
		try {
			for(int i=0;i<6;i++)
				{
					System.out.println(a[i]);
				}
			
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array index out of bounds");
			}
			
			finally
			{
				System.out.println("go to next line");
			}
			
		
		
		// TODO Auto-generated method stub

	}

}
