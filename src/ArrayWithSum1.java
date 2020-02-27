
public class ArrayWithSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,2,2};
		int sum=5;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		

	}

}
