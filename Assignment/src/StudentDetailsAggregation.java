
class StudentDetails
{
	int rno;
	String name;
	
	StudentDetails(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
}

class DisplayDetails
{
	String address;
	
	DisplayDetails(String address, StudentDetails obj1)
	{
		this.address=address;
		System.out.println(" roll number "+obj1.rno+" name "+obj1.name+" Address "+address);
		
	}
}


public class StudentDetailsAggregation {

	StudentDetails obj0=new StudentDetails(101,"Aji");
	DisplayDetails obj1=new DisplayDetails("krishnagiri",obj0);
}
