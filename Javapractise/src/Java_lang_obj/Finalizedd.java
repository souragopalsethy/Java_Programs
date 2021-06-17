package Java_lang_obj;

public class Finalizedd {
	static String s="biku";
	public void finalize()
	{
		System.out.println("Hey am finalized metod");
	}

	public static void main(String[] args)throws Throwable {
		Finalizedd a= new Finalizedd ();
		s=null;
		a.finalize();
		String b = new String();
		b=null;
		System.gc();
		//b.finalize();
	
		
		
		// TODO Auto-generated method stub

	}

}
