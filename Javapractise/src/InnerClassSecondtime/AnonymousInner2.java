package InnerClassSecondtime;

public class AnonymousInner2 {

	public static void main(String[] args) {
		Runnable r= new Runnable()
				{
			     public void run()
			     {for(int i=0;i<11;i++)
			    	 System.out.println("child thread");
			     }
				};
				Thread t= new Thread(r);
				t.start();
				for(int i=0;i<11;i++)
				System.out.println("main thread");
		// TODO Auto-generated method stub

	}

}
