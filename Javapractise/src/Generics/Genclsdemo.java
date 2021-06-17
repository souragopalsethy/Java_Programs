package Generics;

public class Genclsdemo<a,b> {
	a val1;
	b val2;
	
	Genclsdemo(a val1,b val2)
	{
		this.val1=val1;
		this.val2=val2;
	}
	public void sum()
	
	{
		
		System.out.println();
	}
	public static void main(String[] args) {
		Genclsdemo o=new Genclsdemo(1,10.5);
		o.sum();
		// TODO Auto-generated method stub

	}

}
