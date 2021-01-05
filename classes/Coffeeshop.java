package classes;
import java.lang.*;
import interfaces.*;

public class Coffeeshop implements ProductOperations
{
	private String name;
	private String cid;
	private Product products[] = new Product [10];
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCid(String cid)
	{
		this.cid = cid;
	}
	
	
	public String getName()
	{
		return name;
	}
	public String getCid()
	{
		return cid;
	}
	
	public void insertProduct(Product p)
	
	{
		int flag = 0;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == null)
			{
				products[i] = p;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Products Inserted");
		}
		else
		{
			System.out.println("Can Not Insert Product");
		}
	}
	
	public void removeProduct(Product p)
	{
		int flag = 0;
		for(int i=0; i<products.length; i++)
		{
			if(products[i] == p)
			{
				products[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Product Removed");}
		else{System.out.println("Can Not Remove Product");}
	}
	
	
	
	public Product getProduct(String pid)
	
	{
		Product p = null;
		
		for(int i=0; i<products.length; i++)
		{
			if(products[i] != null)
			{
				if(products[i].getPid() == pid)
				{
					p = products[i];
					break;
				}
			}
		}
		if(p != null)
		{
			System.out.println("Product Found");
		}
		else
		{
			System.out.println("Product Not Found");
		}
		return p;
	}
	
	public void showAllProducts()
	{
		for(Product p : products)
		{
			if(p != null)
			{
				p.showInfo();
			}
		}
	}

}