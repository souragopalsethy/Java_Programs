package prog;

public class Book {
	String name;
	double price;
	int page;
	public Book(String name,double price,int page)
	{
		this.name=name;
		this.price=price;
		this.page=page;
	}
	public String toString()
	{
		return "Name of book is "+name+"\n price of book is "+price+"\n page of book is "+page;
	}

}
