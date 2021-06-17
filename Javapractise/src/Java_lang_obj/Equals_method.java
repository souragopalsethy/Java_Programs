package Java_lang_obj;

public class Equals_method {
	String s;

	
	Equals_method(String s)
	{
		this.s=s;
		
	}
 
	public boolean equals(Object b)
	{
		String s1=this.s;
		Equals_method m=(Equals_method)b;
		String s2=m.s;
		if(s1.equals(s2))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Equals_method o=new Equals_method("srk");
		Equals_method o1=new Equals_method("srk");
		System.out.println(o.equals(o1));
		System.out.println(o.hashCode());
		System.out.println(o1.hashCode());
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
