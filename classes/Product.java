package classes;
import java.lang.*;
import interfaces.*;


public abstract class Product implements IQuantity
{
	protected String pid;
    protected String name;
    protected int quantity;
    protected double price;
	
	
	public void setPid(String pid){this.pid = pid;}
    public void setName(String name){this.name = name;}
    public void setQuantity(int quantity){this.quantity = quantity;}
    public void setPrice(double price){this.price = price;}
	
	public String getPid(){return pid;}
    public String getName(){return name;}
    public int getquantity(){return quantity;}
    public double getPrice(){return price;}
	
    public abstract void showInfo();
	
	public void addQuantity(int amount)
	{
		if (amount>0)
		{ 
	      System.out.println("Previous Quantity: "+ quantity);
		  quantity=quantity+amount;
		  System.out.println("Current Quantity: "+ quantity);
	    }
	    else
		{
			System.out.println("Invalid ");
		}
	}
	
	
	
	public void sellQuantity(int amount)
	{
     if (amount>0 && amount<=quantity)
	 {
		 System.out.println("Previous Quantity: "+ quantity);
		 System.out.println("Sell Quantity: "+ amount);
		 quantity=quantity-amount;
		 System.out.println("After Selling:	"+ quantity);
      
	 }
	 else
		{
			System.out.println("Empty");
		}
	

	}
	
}