import java.time.Year;
import java.util.*;

class Age
{
	private int age, yob;

	public int getAge() {
		return age;
	}

	
	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
		int thisyear=Year.now().getValue();
		age=thisyear-this.yob;
		
	}

	
}


public class Encapsulation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year of Birth ");
		int a=sc.nextInt();
		Age obj1=new Age();
		obj1.setYob(a);
		System.out.println("Year of Birth "+obj1.getYob());
		System.out.println("Your age is "+obj1.getAge());
		
		
		
		

	}

}
