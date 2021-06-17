package InnerClasses;


public class AnnonymousExtendingAThreadClass {

	public static void main(String[] args) {
		Thread t=new Thread()
				{
			      public void run()
			      {
			    	  for(int i=0;i<=10;i++)
			    	  {
			    		  System.out.println("hi"+i);
			    		  try
			    		  {
			    			  Thread.sleep(1000);
			    		  }
			    		  catch(Exception e) {e.printStackTrace();}
			    	  }
			      }
			
				};
				t.start();
				t.interrupt();
		// TODO Auto-generated method stub

	}

}
