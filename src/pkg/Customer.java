package pkg;

public class Customer 
{
	String c_name;
	String c_name2;
	long mb_no;
	int token;
	Hotel h;
	public Customer(String c_name, String c_name2, long mb_no) 
	{
		this.c_name = c_name;
		this.c_name2 = c_name2;
		this.mb_no = mb_no;
	}
	public Customer(String c_name, long mb_no) 
	{
		this.c_name = c_name;
		this.c_name2 = null;
		this.mb_no = mb_no;
	}
	
}