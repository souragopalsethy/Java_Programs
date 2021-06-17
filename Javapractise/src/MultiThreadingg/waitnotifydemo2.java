package MultiThreadingg;
class ct6 extends Thread
{
	int sum=0;
	public synchronized void run()
	{
		for(int i=0;i<100;i++)
		{
			sum=sum+i;
		}
		this.notify();
	}
			
	
}

public class waitnotifydemo2 {

	public static void main(String[] args) throws InterruptedException {
		ct6 o=new ct6();
		o.start();
     synchronized (o) {
    	 o.wait();
 		System.out.println(o.sum);

		
	}
		
		// TODO Auto-generated method stub

	}

}
