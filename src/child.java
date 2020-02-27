class Parent
{
	void show()
	{
		System.out.println("Inside Parent");
	}
}
public class child extends Parent{

		void show1()
		{
			super.show();
			System.out.println("Inside Child");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.show1();

	}

}
