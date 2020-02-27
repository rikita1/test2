
class AgeException extends Exception {
	AgeException()
	{
		
	}
}

public class CustomException
{
	static void check(int age) throws AgeException{
		if(age<18)
			throw new AgeException();
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String args[])
{
	int age=2;
	try
	{
	check(age);
	}
	catch(Exception m)
	{
		System.out.println("Exception occuurred"+m);
	}
}
}
