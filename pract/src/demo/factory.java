package demo;


public class factory  {
	public static Tv model(String s)
	{
		if(s.equalsIgnoreCase("samsung"))
		{
			Samsung t=new Samsung();
			return t;
		}
		else if(s.equalsIgnoreCase("lg"))
		{
			Lg g=new Lg();
         	return g;
		}
		else if(s.equalsIgnoreCase("redmi"))
		{
			redmi r=new redmi();
			return r;
		}
		else
		return null;
		
		
	}

}
