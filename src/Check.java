
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		try
		{
			x=12;
		}
		finally
		{
			x=20;
			System.out.println("Inside finally");
			return x;
		}

	}

}
