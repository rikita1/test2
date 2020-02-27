/*When we print the object then compiler call object.toString() method which is used to display
 * string represntation of object..if we don't override toString() method then we will get the output as
 * classname@hashcode
 */
public class toStringDemo {

	int age;
	String name;
	toStringDemo(int age,String name)
	{
		this.age=age;
		this.name=name;
		
	}
	public String toString()
	{
		return age+" "+name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toStringDemo t=new toStringDemo(10,"rikita");
		System.out.println(t);

	}

}
