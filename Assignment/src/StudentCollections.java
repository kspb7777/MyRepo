import java.util.ArrayList;
import java.util.Iterator;

class StudentDetails1
{
	String name;
	int rno;
	double mark_percentage;
			
	StudentDetails1(String name, int rno,double mark_percentage)
	{
		this.name=name;
		this.rno=rno;
		this.mark_percentage=mark_percentage;
		
	}
	
	
	
}

public class StudentCollections {

	public static void main(String[] args) {
		
		ArrayList<StudentDetails1> array1=new <StudentDetails1> ArrayList();
		
		StudentDetails1 obj1=new StudentDetails1("Aji",101,88.8);
		array1.add(obj1);
		StudentDetails1 obj2=new StudentDetails1("kiran",102,56.5);
		array1.add(obj2);
		array1.forEach((e) -> 
		
		{	System.out.println(e.name);
			System.out.println(e.rno);
		      System.out.println(e.mark_percentage);
		    
		});
		
		
		
		
		
		
		
	}
}