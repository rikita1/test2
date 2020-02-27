
public class FibonacciCode {

	static void find(int n)
	{
		int a=0,b=1;
		System.out.println(a+"\n"+b);
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
		int n=4;
		find(n);

	}

}
