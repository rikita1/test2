import java.util.Vector;

public class Test20 {

	public static void main(String[] args) {
		final int v =20;
		Runnable run = new Runnable() {
			final int v = 18 ;
			@Override
			public void run() {
				final int v = 15;
				System.out.println(this.v);
				
			}
		};
		
		new Thread(run).start();
		

	}
	public void test() {
		final int v = 20;
	}

}
