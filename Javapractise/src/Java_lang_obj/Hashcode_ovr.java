package Java_lang_obj;

public class Hashcode_ovr {
	static int count=0;// if i not declar it static den it not got updated coz instance veriable has many copy for each object
	public int hashCode()
	{
		count=count+1;
		return count;
	
	}

	public static void main(String[] args) {
		Hashcode_ovr a=new Hashcode_ovr();
		Hashcode_ovr b= new Hashcode_ovr();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		Hashcode_ovr c=new Hashcode_ovr();
		Hashcode_ovr d= new Hashcode_ovr();
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		String s= new String("ss");
		System.out.println(s.hashCode());//coz i clled hascode method of string class
		
		// TODO Auto-generated method stub

	}

}
