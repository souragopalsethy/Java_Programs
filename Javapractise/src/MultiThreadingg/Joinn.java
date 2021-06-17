package MultiThreadingg;
class mm extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.print((char)(65+i) +"  ");
			try {
				Thread.sleep(1000);
				}
				catch (InterruptedException e) {e.printStackTrace();}
			
				
		}
		
	}
}

public class Joinn {

	public static void main(String[] args) throws InterruptedException {
		mm t= new mm();
		t.start();
		System.out.println("here the main thread wait util completion of child thrad");
		t.join();
		for(int i=0;i<=10;i++)
		{
			System.out.print((char)(97+i)+" ");
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}

