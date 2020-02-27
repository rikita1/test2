import java.io.*;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileInputStream f=new FileInputStream("C:/Users/RikitaBhattacharya/Documents/SametimeFileTransfers/test.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
