package MultiThreadingg;
final class ct1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("child");
			//Thread.yield();
		}
	}
}
public class yeild_Demo {

	public static void main(String[] args) {
		ct1 o= new ct1();
		o.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main");
			
		}
		// TODO Auto-generated method stub

	}

}
