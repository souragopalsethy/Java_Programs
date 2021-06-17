package Java_lang_obj;

class dog implements Cloneable
{
	int x=10;
	int y=20;
}
public class cln implements Cloneable {

	public static void main(String[] args)throws Exception {
		dog d1= new dog();
		//dog d2= d1.clone(); why its a eeror
		
	System.out.println(d1.x+" "+d1.y);
	cln z= new cln();
	cln m= (cln)z.clone();
	
	
;	
		// TODO Auto-generated method stub

	}

}
