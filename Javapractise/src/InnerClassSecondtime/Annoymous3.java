package InnerClassSecondtime;

public class Annoymous3 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run()
			{
				for(int i=0;i<11;i++)
					System.out.println("child thread");
			}
		}).start();
		for(int i=0;i<11;i++)
			System.out.println("main thread");
		// TODO Auto-generated method stub

	}

}
