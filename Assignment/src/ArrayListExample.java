
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list=new ArrayList<String>();//generic collection
		list.add("Aji");
		list.add("Rahul");
		list.add("Kiran");
		list.add("Sooraj");
		
		Iterator itr=list.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println(list.get(2));
		list.remove(0);// delete
		
		
		System.out.println(list.get(2));
		
		
		Collections.sort(list);//to sort
		
		System.out.println("After Sort");
		list.forEach((e) -> 
		
		{
		      System.out.println(e);
		    
		});
		
		ArrayList Alist=new ArrayList();//non generic
		Alist.add(10);
		Alist.add("Aji");
		int s1 = (int)Alist.get(0);
		String s2 = (String)Alist.get(1);


		
		
		
		
		

		
		
		
		
	}

}
