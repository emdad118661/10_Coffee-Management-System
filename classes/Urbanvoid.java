package classes;
import java.lang.*;
import interfaces.*;

public class Urbanvoid implements CoffeeshopOperations, EmployeeOperations
{
	
	private Coffeeshop coffeeshops[] = new Coffeeshop [400];
	private Employee employees[] = new Employee [100];
	
	public void insertCoffeeshop(Coffeeshop c)
	
	{
		int flag = 0;
		for(int i=0; i<coffeeshops.length; i++)
		{
			if(coffeeshops[i] == null)
			{
				coffeeshops[i] = c;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Coffeeshop Inserted");
		}
		else
		{
			System.out.println("Can Not Insert Coffeeshop");
		}
	}
	
	public void removeCoffeeshop(Coffeeshop c)
	{
		int flag = 0;
		for(int i=0; i<coffeeshops.length; i++)
		{
			if(coffeeshops[i] == c)
			{
				coffeeshops[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Coffeeshop Removed");}
		else{System.out.println("Can Not Remove Coffeeshop");}
	}
	

	
	public void showAllCoffeeshops()
	{
		for(Coffeeshop c : coffeeshops)
		{
			if(c != null)
			{
				System.out.println("**********************************");
				System.out.println("Coffeeshop Name: "+ c.getName());
				System.out.println("Coffeeshop ID: "+ c.getCid());
				System.out.println("----------------------------------");
				c.showAllProducts();
				System.out.println("----------------------------------");
			}
		}
	}
	

	public Coffeeshop getCoffeeshop(String cid)
	{
		Coffeeshop c = null;
		
		for(int i=0; i<coffeeshops.length; i++)
		{
			if(coffeeshops[i] != null)
			{
				if(coffeeshops[i].getCid() == cid)
				{
					c = coffeeshops[i];
					break;
				}
			}
		}
		if(c != null)
		{
			System.out.println("Coffeeshop Found");
		}
		else
		{
			System.out.println("Coffeeshop Not Found");
		}
		return c;
	}
	
	
	public void insertEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Employee Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Employee Removed");}
		else{System.out.println("Can Not Remove");}
		
		
	}
	public void showAllEmployees()
	{
		System.out.println("//////////////////////////////////");
		for(Employee e : employees)
		{
			if(e != null)
			{
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee ID: "+ e.getEmpId());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
		System.out.println("//////////////////////////////////");
	}
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		if(e != null)
		{
			System.out.println("Employee Found");
		}
		else
		{
			System.out.println("Employee Not Found");
		}
		return e;
	}
}