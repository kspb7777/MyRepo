
class Palindromecheck
{
	
	 Boolean palindromecheck1(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;j--;
		}
		
		return true;
		
	}
}



public class PalindromeString {

	public static void main(String[] args) {
		
		
		
		Palindromecheck obj1=new Palindromecheck();
		Boolean x=obj1.palindromecheck1("malayalam");
		if(x)
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println(" NOT A PALINDROME");
		}
		}
		
		
		
		
	}
