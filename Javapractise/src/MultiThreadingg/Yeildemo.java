package MultiThreadingg;
 
class Child extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print((char)(64+i) +"  ");
			try {
				Thread.sleep(1000);
				}
				catch (InterruptedException e) {e.printStackTrace();}
			
				
		}
		
	}
}

public class Yeildemo {

	public static void main(String[] args) {
		Child t= new Child();
		t.start();
		Thread.yield();
		
		for(int i=0;i<=10;i++)
		{
			System.out.print((char)(97+i));
			Thread.yield();
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
