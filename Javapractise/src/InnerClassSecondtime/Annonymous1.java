package InnerClassSecondtime;

public class Annonymous1 {

	public static void main(String[] args) {
		Thread t= new Thread()
				{
			        public void run(){
			        	for(int i=0;i<11;i++)
			        		System.out.println("child thread");
			        	
			        }
		
				};
				t.start();
				for(int i=0;i<11;i++)
					System.out.println("main thread");
		// TODO Auto-generated method stub

	}

}
