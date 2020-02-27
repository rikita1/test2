import java.util.Scanner;

class AgeCheckException extends Exception
{
	String msg;
	AgeCheckException(String message)
	{
		this.msg=message;
	}
	public String toString()
	{
		return msg;
	}
	
}
public class ExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try
		{
			if(age<0)
			{
				throw new AgeCheckException("Age should not be negative");
			}
			else if(age<18)
			{
				throw new AgeCheckException("Age should not be less than 18");
			}
		}
		catch(AgeCheckException e)
		{
			System.out.println(e);
		}
	}

}
