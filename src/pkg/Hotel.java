package pkg;

public interface Hotel {
	String hotelName="Royal Hotel";
	double total=0.0;
	
	public double displayBill(String name,int table_no);
	public void orderFood();		

	public double getTotal();
}
