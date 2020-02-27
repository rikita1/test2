
public class HCFCode {

	static int findHCF(int a,int b)
	{
		int gcd=1;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			gcd=i;
		}
		return gcd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=98,b=56;
		System.out.println(findHCF(a,b));

	}

}
