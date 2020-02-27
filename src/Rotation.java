
public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcd";
		String s2="dcab";
		String temp=s1+s1;
		if(temp.contains(s2))
			System.out.println("Rotations");
		else
			System.out.println("No");
	}

}
