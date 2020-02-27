/*In factory pattern,we create objects without exposing creation logic to client and 
 * referring to newly created object using a common interface
 */
interface A
{
	void show();
}
class Rectangle implements A
{
	public void show()
	{
		System.out.println("Inside Rectangle");
	}
	
}
class Circle implements A
{
	public  Circle()
	{
		System.out.println("rikit");
		}
	public void show()
	{
		System.out.println("Inside Circle");
	}
	
}


public class FactoryClass {
	public A getA(String shapetype)
	{
		if(shapetype==null)
			return null;
		else if(shapetype.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else
			return new Rectangle();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryClass f=new FactoryClass();
		A f1=f.getA("CIRCLE");
		f1.show();
		A f2=f.getA("Rectangle");
		f2.show();
		
	}

}
