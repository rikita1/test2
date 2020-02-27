
public class FibonacciTry {
	
	public static void try1(int n)
	{
		int a=1,b=2;
		System.out.println(a+" "+b);
		for(int i=1;i<=n-2;i++)
		{
			int sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		try1(n);
String name="rikita";
Object o=name;
	}

}
