package multithread_2;
class ct10 extends Thread
{


	@Override
	public void run() {
		System.out.println("its child");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().yield();//use of yeild
	}
	
}

public class demo2 {
	public static void main(String[] args) {
		ct10 t= new ct10();
		t.setName("child thread");
		t.start();
	}

}
