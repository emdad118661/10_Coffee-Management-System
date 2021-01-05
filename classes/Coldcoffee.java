package classes;
import java.lang.*;
import interfaces.*;

public class Coldcoffee extends Product
{
	private String size;
	
	public void setSize(String size)
	{
		this.size = size;
	}
	
	public String getSize()
	{
		return size;
	}
	
	public void showInfo()
	{
		System.out.println("Product Id: "+getPid());
		System.out.println("Product Name: "+getName());
		System.out.println("Quantity: "+getquantity());
		System.out.println("Product Id: "+getPid());
		System.out.println("Price: $"+ getPrice());
		System.out.println("Size :"+ getSize());
		System.out.println();
	}
}