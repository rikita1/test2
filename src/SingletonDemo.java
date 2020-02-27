/* In Singleton pattern,only 1 instance of class is created and is globally accessed
 * by other classes
 * Saves memory as object is not created for each request.Only single instance
 * is used again and again.
 * 1.Static member:It get memory only once and contains instance of Singleton class
 * 2.Private constructor prevents instance to be created from outside the class
 * 3.Static method which provides global access to Singleton object:
 * 2 types:
 * 1.Early Initialization:Once the class is loaded then instance is created
 * 2.Lazy Initialization:Instance created only when it is required.
 */
public class SingletonDemo {
	private static  SingletonDemo a;
	private SingletonDemo()
	{
		
	}
	public static SingletonDemo getInstance()
	{
		a=new SingletonDemo();
		return a;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	{
	}
	
		

	}

}
