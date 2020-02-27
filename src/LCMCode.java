import java.util.Arrays;
import java.util.List;

public class LCMCode {

	static int LCM(int a,int b)
	{
		int lcm=(a>b)?a:b;
		while(true)
		{
			if(lcm%a==0 && lcm%b==0)
			{
				return lcm;
			}
			lcm++;
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=72,b=120;
		//System.out.println(LCM(a,b));
		char arr[]= {'a','b','c','d'};
		
        int x=-8;
        int y=~x;
        System.out.println(y);
        


	}

}

