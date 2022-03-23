import java.util.*;


class CollectionOperations
{
	Scanner sc=new Scanner(System.in);
	
	void add(ArrayList array1)
	{
		System.out.println("Enter the number to insert");
		int a=sc.nextInt();
		array1.add(a);
	}
	void delete(ArrayList array1)
	{
		System.out.println("Enter the position to delete");
		int b=sc.nextInt();
		
		array1.remove(b-1);
		System.out.println("element in position "+(b-1)+" got Deleted");
		
	}
	
	void display(ArrayList array1)
	{
		int d=array1.size();
		Iterator itr1=array1.iterator();
		
		System.out.println("Elements are ....");
		for(int i=0;i<d;i++)
		{
			System.out.println(itr1.next());
		}
	}
	
	void sort(ArrayList array1)
	{
		Collections.sort(array1);
		System.out.println("Sorted Elements are ....");
		Iterator itr1=array1.iterator();
		int d=array1.size();
		for(int i=0;i<d;i++)
		{
			System.out.println(itr1.next());
		}
	}
}




public class CollectionsExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		ArrayList<Integer> array1=new ArrayList<Integer>();
		CollectionOperations obj1=new CollectionOperations();
		while(i!=5)
		{
			System.out.println("Enter the option");
			System.out.println("1.INSERT");
			System.out.println("2.DELETE");
			System.out.println("3.DISPLAY");
			System.out.println("4.SORT");
			System.out.println("5.QUIT");
			i=sc.nextInt();
			switch(i)
			{
			case 1:
			obj1.add(array1);
			break;
			case 2:
			obj1.delete(array1);
			break;
			case 3:
			obj1.display(array1);
			break;
			case 4:
				obj1.sort(array1);
				break;
				
			
			}
		}
		
		
		
}

}
