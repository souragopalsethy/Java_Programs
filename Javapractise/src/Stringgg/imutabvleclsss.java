package Stringgg;


public class imutabvleclsss {
	int i;
	
	imutabvleclsss(int i)
	{
		this.i=i;
	}
	public imutabvleclsss check(int t)
	{
		if(this.i==t)
		{
			return this;
		}
		else
			return (new imutabvleclsss(t));
	}

	public static void main(String[] args) {
		imutabvleclsss t1= new imutabvleclsss(1);
		imutabvleclsss t2= t1.check(1);
		imutabvleclsss t3=t1.check(2);
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		
		
	
		
		// TODO Auto-generated method stub

	}

}
