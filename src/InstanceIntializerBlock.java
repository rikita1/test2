
public class InstanceIntializerBlock {
	
	InstanceIntializerBlock()
	{
		System.out.println("Inside constructor");
	}
	{
		System.out.println("inside initialzer block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceIntializerBlock i=new InstanceIntializerBlock();

	}

}
