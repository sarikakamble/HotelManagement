package pkg;

import java.util.Date;

public class NonVeg implements Hotel
{
	double total;
	String f1="Chicken Chilly       ";
	double p1=120.0;
	int q1;
	String f2="Chicken Lollypop     ";
	double p2=150.0;
	int q2; 
	String f3="Chicken Spring Roll  ";
	double p3=180.0;
	int q3;
	
	String f4="Chicken Masala       ";
	double p4=220.0;
	int q4;
	String f5="Butter Chicken       ";
	double p5=280.0;
	int q5;
	String f6="Butter Chicken       ";
	double p6=290.0;
	int q6;
	
	String f7="Roti                 ";
	double p7=15.0;
	int q7;
	String f8="Butter Roti          ";
	double p8=20.0;
	int q8;
	String f9="Butter Naan          ";
	double p9=35.0;
	int q9;
	
	String f10="Chicken Biryani      ";
	double p10=200.0;
	int q10;
	String f11="Jeera Rice          ";
	double p11=130.0;
	int q11;
	
	
	public void orderFood()
	{
		int ch;
		do
		{
			int index=0;
			System.err.println("***** ************ ***"+hotelName+"*** ************ *****");
			System.out.println("________________________________________________");
			System.err.println("No:.   Menu       Price");
			System.err.println(" NON-VEG STARTER ");
			System.out.println(++index+this.f1+"   "+p1);
			System.out.println(++index+this.f2+"   "+p2);
			System.out.println(++index+this.f3+"   "+p3);
			System.err.println(" NON-VEG MAIN COURSE ");
			System.out.println(++index+this.f4+"   "+p4);
			System.out.println(++index+this.f5+"   "+p5);
			System.out.println(++index+this.f6+"   "+p6);
			System.err.println(" Roti ");
			System.out.println(++index+this.f7+"   "+p7);
			System.out.println(++index+this.f8+"   "+p8);
			System.out.println(++index+this.f9+"   "+p9);
			System.err.println(" Rice ");
			System.out.println(++index+this.f10+"   "+p10);
			System.out.println(++index+this.f11+"   "+p11+"\n");
			System.out.println("Enter your menu");
			int c=Veg.sc.nextInt();
			switch(Veg.sc.nextInt())
		    {
		    case 1:
		    	System.out.println("plese enter qty"+(char)2);
		    	q1+=Veg.sc.nextInt();
		    	break;
		    	
		    case 2:
		    	System.out.println("plese enter qty"+(char)2);
		    	q2+=Veg.sc.nextInt();
		    	break;
		    case 3:
		    	System.out.println("plese enter qty"+(char)2);
		    	q3+=Veg.sc.nextInt();
		    	break;
		    case 4:
		    	System.out.println("plese enter qty"+(char)2);
		    	q4+=Veg.sc.nextInt();
		    	break;
		    case 5:
		    	System.out.println("plese enter qty"+(char)2);
		    	q5+=Veg.sc.nextInt();
		    	break;
		    case 6:
		    	System.out.println("plese enter qty"+(char)2);
		    	q6+=Veg.sc.nextInt();
		    	break;
		    case 7:
		    	System.out.println("plese enter qty"+(char)2);
		    	q7+=Veg.sc.nextInt();
		    	break;
		    case 8:
		    	System.out.println("plese enter qty"+(char)2);
		    	q8+=Veg.sc.nextInt();
		    	break;
		    case 9:
		    	System.out.println("plese enter qty"+(char)2);
		    	q8+=Veg.sc.nextInt();
		    	break;
		    case 10:
		    	System.out.println("plese enter qty"+(char)2);
		    	q8+=Veg.sc.nextInt();
		    	break;
		    case 11:
		    	System.out.println("plese enter qty"+(char)2);
		    	q8+=Veg.sc.nextInt();
		    	break;
		    	
		    }
			System.err.println("1.you wanna order 2.stop");
			ch=Veg.sc.nextInt();
			
		}while(ch!=2);
		
	}
	public double displayBill(String name,int table_no)
	{
		int index=0;
		double t=0;  //change
		Date d=new Date();
		System.out.println("***** ************ *** Royal Hotel *** ************ *****");
		System.out.println("Table No"+(table_no+1)+"  Name:-"+name+"\t"+d);
		System.out.println("                        Cash Memo                        ");
		System.out.println("____________________________________________________________");
		System.out.println("No:.    Menu       Price\tQut.\t SubTotal         ");
		System.out.println("____________________________________________________________");
		if(q1>0)
		{
			t=q1*p1;
			this.total+=t;
			System.out.println(++index+" "+this.f1+p1+"\t"+q1+"\t"+t);
		}
		if(q2>0)
		{
			t=q2*p2;
			this.total+=t;
			System.out.println(++index+" "+this.f2+p3+"\t"+q2+"\t"+t);
		}
		if(q3>0)
		{
			t=q3*p3;
			this.total+=t;
			System.out.println(++index+" "+this.f3+p3+"\t"+q3+"\t"+t);
		}
		
		if(q4>0)
		{
			t=q4*p4;
			this.total+=t;
			System.out.println(++index+" "+this.f4+p4+"\t"+q4+"\t"+t);
		}
		
		if(q5>0)
		{
			t=q5*p5;
			this.total+=t;
			System.out.println(++index+" "+this.f5+p5+"\t"+q5+"\t"+t);
		}
		if(q6>0)
		{
			t=q6*p6;
			this.total+=t;
			System.out.println(++index+" "+this.f6+p6+"\t"+q6+"\t"+t);
		}
		if(q7>0)
		{
			t=q7*p7;
			this.total+=t;
			System.out.println(++index+" "+this.f7+p7+"\t"+q7+"\t"+t);
		}
		if(q8>0)
		{
			t=q8*p8;
			this.total+=t;
			System.out.println(++index+" "+this.f8+p8+"\t"+q8+"\t"+t);
		}
		if(q9>0)
		{
			t=q9*p9;
			this.total+=t;
			System.out.println(++index+" "+this.f1+p9+"\t"+q9+"\t"+t);
		}
		if(q10>0)
		{
			t=q10*p10;
			this.total+=t;
			System.out.println(++index+" "+this.f10+p10+"\t"+q10+"\t"+t);
		}
		if(q11>0)
		{
			t=q11*p11;
			this.total+=t;
			System.out.println(++index+" "+this.f1+p11+"\t"+q11+"\t"+t);
		}
		System.out.println("____________________________________________________________");
		System.out.println("                       \t Total: "+this.total);
		System.out.println("____________________________________________________________");
		//System.out.println("Thank You...! Visit Again...!");
		return this.total;
	}
	public double getTotal()
	{
		return this.total;
	}
}

