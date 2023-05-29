package pkg;


import java.awt.AWTError;
import java.util.ArrayList;
import java.util.Scanner;
public class HotelManagement 
{
	
	ArrayList al=new ArrayList(); //
	ArrayList wl=new ArrayList();//waiting list
	//Hotel h;
	Table []t=new Table[2];
	Customer cu;
	int token=1;
	int intoken=1;

	void addCustomer()
	{
		System.out.println("One or Two Person");
		int c=Veg.sc.nextInt();
		if(c==1)
		{
			System.out.println("Enter Customer Name:");
			String name=Veg.sc.next();
			System.out.println("Enter Customer Mo_No:");
			long mb_no=Veg.sc.nextLong();
			cu=new Customer(name,mb_no);

		}
		if(c==2)
		{
			System.out.println("Enter Custome Name:");
			String name=Veg.sc.next();
			System.out.println("Enter Custome Name:");
			String name1=Veg.sc.next();
			System.out.println("Enter Custome Mo_No:");
			long mb_no=Veg.sc.nextLong();
			 cu=new Customer(name,name1,mb_no); 
		}
		
		if(c!=1&&c!=2)
		{
			System.out.println("Please Enter How Many Customer ");
			addCustomer();
		}
		
		int t=tableArrenge();
		
		if(t>=0&&t<12)
		{
			int tn=chooiseTable();
			if(this.t[tn]==null)
			{
				this.t[tn]=new Table(cu);
				System.err.println("\nPlease seat the table:"+(tn+1));
			}else
			{
				System.out.println("Table are not Available");
			}
		}else
		{
			System.out.println("Please wait some time.....");
			cu.token=this.token;
			System.out.println("Your Token No is:"+this.token++);
			wl.add(cu);
		}
		
		System.out.println("Customer is added");
	}
	
	int tableArrenge()
	{
		for(int i=0;i<t.length;i++)
		{
			if(t[i]==null)
			{
				return i;
			}
		}
		return -1;
	}
	 public int chooiseTable()
	 {
		 System.out.println("** *** Table Are Availabe *** **");
		 for(int i=0;i<t.length;i++)
			{
				if(t[i]==null)
				{
					System.out.print((i+1)+"   ");
				}
			}
		 System.out.println("\n Enter the Table No: ");
		 int ch=Veg.sc.nextInt();
		 if(ch<=t.length)
			 return ch-1;
		 else
		 {
			 System.out.println("table are not Avilable");
			 
		 }
		 return chooiseTable();
			 
	 }
	void makeOrder(int tno)
	{
	
		if(t[tno].cu.h==null)
		{
			System.err.println("1.Veg 2.Non-Veg");
			int c=Veg.sc.nextInt();
			if(c==1)
			{
				
				t[tno].cu.h=new Veg();
				
			}
			if(c==2)
			{
				t[tno].cu.h=new NonVeg();
				
			}	
		}
		t[tno].cu.h.orderFood();	
	}
	
	void bill(int tno)
	{
		if(t[tno].cu.h!=null)
		{
			double amt=t[tno].cu.h.displayBill(t[tno].cu.c_name, tno);
			System.out.println("Please enter the amount");
			double p=Veg.sc.nextDouble();
			System.err.println("Thank You...! Visit Again...!\n");
			if(p>=amt)
			{
				al.add(t[tno]);
				t[tno]=null;
				if(!wl.isEmpty())
				{
					waitingCustomers();
				}
			}else
			{
				System.out.println("Bill are Not paid");			
			}
		}else
		{
			System.err.println("1st oreder food");
		}
	}
	
	public void waitingCustomers()
	{
		Customer c=(Customer) wl.get(0);
		System.err.println("**** ************* ****");
		System.out.println("Name:"+cu.c_name +"\t+Token No:"+(this.intoken++)+"You are Available");
		System.out.println("Enter  1.Yes  2.No");
		int a=Veg.sc.nextInt();
		if(a==1)
		{
			int tn=chooiseTable();
			if(this.t[tn]==null)
			{
				this.t[tn]=new Table(cu);
				System.err.println("\nPlease seat the table:"+(tn+1));
			}
			
		}
		else
		{
			wl.remove(0);
			waitingCustomers();
			
		}
		
	}
	//
	public void toDay()
	{
		
		int total=0;
		int cNo=1;
		System.out.println("\n\n");
		System.err.println("*** ************ ***Royal Hotel*** ************ ***\n");
		System.out.println("Day & Date:"+new java.util.Date());
		System.out.println("__________________________________________________");
		System.out.println("CNo: Customer Name:\tCustomer M_No\t Amount");
		System.out.println("__________________________________________________");
		for(int i=0;i<al.size();i++)
		{
			Table t=(Table) al.get(i);
			System.out.println((cNo++)+"  "+t.cu.c_name+"\t   "+t.cu.mb_no+"\t   "+t.cu.h.getTotal());
			total+=t.cu.h.getTotal();
		}
		System.out.println("__________________________________________________");
		System.err.println("\n\t\tTotal:"+total);
		System.out.println("__________________________________________________");
	}
}
