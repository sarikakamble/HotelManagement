package pkg;

import java.util.Date;
import java.util.Scanner;

public class Veg implements Hotel
{
	static Scanner sc=new Scanner(System.in);
	double total;
	String f1="Roasted Papad  ";
	double p1=20.0;
	int q1;
	String f2="Masala Papad   ";
	double p2=30.0;
	int q2;
	String f3="Paneer Pakoda  ";
	double p3=80.0;
	int q3;
	
	String f4="Mix Veg        ";
	double p4=120.0;
	int q4;
	String f5="Paneer Tikka   ";
	double p5=180.0;
	int q5;
	String f6="Butter Masala  ";
	double p6=170.0;
	int q6;
	
	String f7="Roti           ";
	double p7=15.0;
	int q7;
	String f8="Butter Roti    ";
	double p8=20.0;
	int q8;
	String f9="Butter Naan    ";
	double p9=35.0;
	int q9;
	
	String f10="Rice           ";
	double p10=100.0;
	int q10;
	String f11="Jeera Rice     ";
	double p11=130.0;
	int q11;
	
	
	public void orderFood()
	{
		int ch;
		do
		{
			int index=0;
			System.err.println("** * "+hotelName+"* **");
			System.out.println("_____________________________");
			System.err.println("No:.   Menu       Price");
			System.err.println(" VEG STARTER ");
			System.out.println(++index+this.f1+"   "+p1);
			System.out.println(++index+this.f2+"   "+p2);
			System.out.println(++index+this.f3+"   "+p3);
			System.err.println(" MAIN COURSE ");
			System.out.println(++index+this.f4+"   "+p4);
			System.out.println(++index+this.f5+"   "+p5);
			System.out.println(++index+this.f6+"   "+p6);
			System.err.println(" Roti ");
			System.out.println(++index+this.f6+"   "+p7);
			System.out.println(++index+this.f8+"   "+p8);
			System.out.println(++index+this.f9+"   "+p9);
			System.err.println(" Rice ");
			System.out.println(++index+this.f10+"   "+p10);
			System.out.println(++index+this.f11+"   "+p11+"\n");
			System.out.println("Enter your menu");
			int c=sc.nextInt();
			switch(sc.nextInt())
		    {
		    case 1:
		    	System.out.println("plese enter qty"+(char)2);
		    	q1+=sc.nextInt();
		    	break;
		    	
		    case 2:
		    	System.out.println("plese enter qty"+(char)2);
		    	q2+=sc.nextInt();
		    	break;
		    case 3:
		    	System.out.println("plese enter qty"+(char)2);
		    	q3+=sc.nextInt();
		    	break;
		    case 4:
		    	System.out.println("plese enter qty"+(char)2);
		    	q4+=sc.nextInt();
		    	break;
		    case 5:
		    	System.out.println("plese enter qty"+(char)2);
		    	q5+=sc.nextInt();
		    	break;
		    case 6:
		    	System.out.println("plese enter qty"+(char)2);
		    	q6+=sc.nextInt();
		    	break;
		    case 7:
		    	System.out.println("plese enter qty"+(char)2);
		    	q7+=sc.nextInt();
		    	break;
		    case 8:
		    	System.out.println("plese enter qty"+(char)2);
		    	q8+=sc.nextInt();
		    	break;
		    case 9:
		    	System.out.println("plese enter qty"+(char)2);
		    	q8+=sc.nextInt();
		    	break;
		    case 10:
		    	System.out.println("plese enter qty"+(char)2);
		    	q8+=sc.nextInt();
		    	break;
		    case 11:
		    	System.out.println("plese enter qty"+(char)2);
		    	q8+=sc.nextInt();
		    	break;
		    	
		    }
			System.err.println("1.you wanna order 2.stop");
			ch=sc.nextInt();
			
		}while(ch!=2);
		
	}
	public double displayBill(String name,int table_no)
	{
		int index=0;
		double t=0;  //change
		Date d=new Date();
		System.out.println("***** ************ *** Royal Hotel *** ************ *****");
		System.out.println("Table No"+table_no+"  Name:-"+name+"\t"+d);
		System.out.println("____________________________________________________________");
		System.out.println("                        Cash Memo                        ");
		
		System.out.println("No:.  Menu       Price\tQut.\t SubTotal         ");
		
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
			System.out.println(++index+" "+this.f2+p2+"\t"+q2+"\t"+t);
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
			t=(int) (q6*p6);
			this.total+=t;
			System.out.println(++index+this.f6+p6+"\t"+q6+"\t"+t);
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
		//System.err.println("Thank You...! Visit Again...!");
		return this.total;
	}
	public double getTotal()
	{
		return this.total;
	}
}
