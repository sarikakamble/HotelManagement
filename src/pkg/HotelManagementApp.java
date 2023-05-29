package pkg;


import java.util.Scanner;

public class HotelManagementApp 
{
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
			HotelManagement m=new HotelManagement(); 
			
			for(;;)
			{
				System.out.println("\n");
				System.out.println("********************************************************************");
				System.out.println("----------------------------ROYAL HOTEl-----------------------------");
				System.out.println("********************************************************************");
				System.out.println("1.Add Customer 2.Make A Order 3.Show The Bill 4.Today Details 5.exit");
				System.out.println("\n");
				switch(sc.nextInt())
				{
				case 1:
				{
					m.addCustomer();
					break;
				}
				case 2:
				{
					System.out.println("Enter the Table no:");
					int tno=Veg.sc.nextInt();
					m.makeOrder(tno-1);
					break;
				}
				case 3:
					System.out.println("Enter the Table no:");
					int tno=Veg.sc.nextInt();
					m.bill(tno-1);
					break;
				case 4:
					m.toDay();
					break;
				case 5:
					System.exit(0);
					break;
				}
			}
	}
}
