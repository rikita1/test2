
public class ReverseArray {

	public static  void reverseArray(int arr[],int start,int end)
	{
		while(start<=end)
		{
			int temp;
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int start=0;
		int end=n-1;
		int arr[]= {1,2,3,4,5};
		reverseArray(arr,start,end);
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
