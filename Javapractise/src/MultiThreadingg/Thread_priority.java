package MultiThreadingg;
 class ct extends Thread
{
	public  void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("child thrad");
	}
}

public class Thread_priority {

	public static void main(String[] args) {
		ct t= new ct();
		System.out.println(t.getPriority());
		t.setPriority(10);
		t.start();
		for (int i = 0; i < 11; i++) {
			System.out.println("main thread");
			
		}
		System.out.println(Thread.currentThread().getPriority());
		
		// TODO Auto-generated method stub

	}

}
