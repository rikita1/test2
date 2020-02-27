
public class Multi extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi m=new Multi();
		Multi m1=new Multi();
		m.start();
		m1.start();
	}

}
