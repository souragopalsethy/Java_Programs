package MultiThreadingg;
class ct2 extends Thread{
	public static Thread t;
	
	@Override

	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
			System.out.println("child");
		
	}
}

public class Child_join_main {

	public static void main(String[] args) {
		 ct2.t = Thread.currentThread();
		ct2 o = new ct2();
		o.start();
		for(int i=0;i<10;i++)
			System.out.println("main");
		// TODO Auto-generated method stub

	}

}
