
public class Divisors {
	static void find(int n) 
    { 
		int count=0;
        for (int i=1;i<=n;i++) 
            if (n%i==0) 
            	System.out.println(i);
                count++;
        System.out.println(count);
        
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		find(n);

	}

}
