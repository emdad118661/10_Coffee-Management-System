import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Urbanvoid f = new Urbanvoid();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("-------Welcome to our Urbanvoid Coffeeshop Management System-----");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?\n");
			System.out.println("	1. Employee Management");
			System.out.println("	2. Coffeeshop Management");
			System.out.println("	3. Coffeeshop Product Management");
			System.out.println("	4. Product Quantity Add-Sell");
			System.out.println("	5. Exit\n");

			System.out.print("Your Choice: ");
			try{
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				    System.out.println("--------------------------------");
					System.out.println("You have choosen Employee Management");
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Insert New Employee");
					System.out.println("	2. Removing an Existing Employee");
					System.out.println("	3. Show All Employees");
					System.out.println("	4. Search an Employee");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					try{
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Employee");
							
							System.out.print("Enter Employee ID: ");
							
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							f.insertEmployee(e1);
							
							System.out.println("########################");
							break;
							
							
						
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove an Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = f.getEmployee(empId2);
							
							if(e2 != null)
							{
								f.removeEmployee(e2);
							}
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Employees");
							f.showAllEmployees();
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Search an Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId3 = sc.next();
							
							Employee e3 = f.getEmployee(empId3);
							
							if(e3 !=null)
							{
								System.out.println();
								System.out.println("Employee ID: "+e3.getEmpId());
								System.out.println("Employee Name: "+e3.getName());
								System.out.println("Employee Salary: "+e3 .getSalary());
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					}
				catch(InputMismatchException ime)
				{
			      System.out.println("InputMismatchException Occured for Employee Management");
			      System.out.println("Please Enter Your choice a number from 1-5");
				  String y = sc.next();
		        }
			
				
				
					
					
					System.out.println("--------------------------------");
					break;
					
					
					
			    case 2:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Coffeeshop Management");
					
					
					System.out.println("Choose any one Option from the followings\n");
					System.out.println("	1. Insert New Coffeeshop");
					System.out.println("	2. Remove Existing Coffeeshop");
					System.out.println("	3. Show All Coffeeshops");
					System.out.println("	4. Search a Coffeeshop");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					try{
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("########################");
							System.out.println("Insert New Coffeeshop");
							
							System.out.print("Enter Coffeeshop CID: ");
							String cid1 = sc.next();
							System.out.print("Enter Coffeeshop Name: ");
							String name1 = sc.next();
							
							
							Coffeeshop c1 = new Coffeeshop();
							c1.setCid(cid1);
							c1.setName(name1);
							
							
							f.insertCoffeeshop(c1);
							
							System.out.println("########################");
							break;
							
						
							
						case 2:
						
							System.out.println("########################");
							System.out.println("Remove Existing Coffeeshop");
							
							System.out.print("Enter Coffeeshop CID: ");
							String cid2 = sc.next();
							
							Coffeeshop c2 = f.getCoffeeshop(cid2);
							
							if(c2 != null)
							{
								f.removeCoffeeshop(c2);
							}
							System.out.println("########################");
							break;
							
						case 3:
						
							System.out.println("########################");
							System.out.println("Show All Coffeeshops");
							f.showAllCoffeeshops();;
							System.out.println("########################");
							break;
							
						case 4:
						
							System.out.println("########################");
							System.out.println("Search a Coffeeshop");
							
							System.out.print("Enter Coffeeshop CID: ");
							String cid3 = sc.next();
							
							Coffeeshop c3 = f.getCoffeeshop(cid3);
							
							if(c3 !=null)
							{
								System.out.println();
								System.out.println("Coffeeshop CID: "+c3.getCid());
								System.out.println("Coffeeshop Name: "+c3.getName());
								f.showAllCoffeeshops();
								System.out.println();
							}
							
							System.out.println("########################");
							break;
							
						case 5:
						
							System.out.println("########################");
							System.out.println("Going Back......");
							System.out.println("########################");
							break;
							
						default:
						
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					}
					catch(InputMismatchException ime)
				{
			      System.out.println("InputMismatchException Occured for Coffeeshop Management");
			      System.out.println("Please Enter Your choice a number from 1-5");
				  String y = sc.next();
		        }
					
					
					        System.out.println("--------------------------------");
                            break;
							
							
				case 3:
				
				    System.out.println("--------------------------------");
				    System.out.println("You have choosen Coffeeshop Product Management");
						   
						   
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert Insert New Product for Coffeeshop");
					System.out.println("	2. Remove Existing Product");
					System.out.println("	3. Search a Product");
					System.out.println("	4. Show All Products");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					try{
					
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
							System.out.println("########################");
							System.out.println("Insert New Product for Coffeeshop\n");
							
							Product a = null;
							System.out.println("Which type of Product?\n");
							System.out.println("	1. HotCoffee");
							System.out.println("	2. ColdCoffee");
							System.out.println("	3. Go Back");
							System.out.print("Enter Type: ");
							int type = sc.nextInt();
						
						
							if(type == 1)
							{
								Hotcoffee hc = new Hotcoffee();
								System.out.print("Product PID: ");
                                String pid1 = sc.next();
								System.out.print("Product Name: ");
								String pn1 = sc.next();
								System.out.print("Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Price: ");
								double p1 = sc.nextDouble();
								System.out.print("Size: ");
								String s1 = sc.next();
								
								hc.setPid(pid1);
								hc.setName(pn1);
								hc.setQuantity(aq1);
								hc.setPrice(p1);								
								hc.setSize(s1);								
								a=hc;
							}
							else if(type == 2)
							{
								Coldcoffee cc= new Coldcoffee();
								
								System.out.print("Product PID: ");
                                String pid1 = sc.next();
								System.out.print("Product Name: ");
								String pn1 = sc.next();
								System.out.print("Available Quantity: ");
								int aq1 = sc.nextInt();
								System.out.print("Price: ");
								double p1 = sc.nextDouble();
								System.out.print("Size: ");
								String s1 = sc.next();
								
								cc.setPid(pid1);
								cc.setName(pn1);
								cc.setQuantity(aq1);
								cc.setPrice(p1);								
								cc.setSize(s1);								
								a=cc;
							}
							else if(type == 3)
							{
								System.out.println("Going Back.......");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							if(a != null)
							{
								System.out.print("Enter Coffeeshop CID: ");
								String cid1 = sc.next();
								f.getCoffeeshop(cid1).insertProduct(a);
							}
							
							System.out.println("########################");
							break;
							
						case 2:
							System.out.println("#####################");
							System.out.println("Remove Existing Product");
							System.out.print("Coffeeshop CID: ");
                            String cid2 = sc.next();
							System.out.print("Product PID: ");
							String pid2 = sc.next();
							
							
							f.getCoffeeshop(cid2).removeProduct(f.getCoffeeshop(cid2).getProduct(pid2));;
							System.out.println("#####################");
							break;
						case 3:
							System.out.println("#####################");
							System.out.println("Search a Product ");
							System.out.print("Coffeeshop CID: ");
                            String cid3 = sc.next();
							System.out.print("Product PID: ");
							String pid3 = sc.next();
							
							
							Product aa = f.getCoffeeshop(cid3).getProduct(pid3);
							if(aa != null)
							{
								aa.showInfo();
							}
							System.out.println("#####################");
							break;
							
							
						case 4: 
							System.out.println("#####################");
							System.out.println("Show All Products");
							
							System.out.print("Enter Coffeeshop CID: ");
							String cid4 = sc.next();
							f.getCoffeeshop(cid4).showAllProducts();
							
							System.out.println("#####################");
							break;
							
						case 5:
							System.out.println("########################");
							System.out.println("Going Back..");
							System.out.println("########################");
							break;
						default:
							System.out.println("########################");
							System.out.println("Invalid Option");
							System.out.println("########################");
							break;
					}
					
					}
					catch(InputMismatchException ime)
				{
			      System.out.println("InputMismatchException Occured for Coffeeshop Product Management");
			      System.out.println("Please Enter Your choice a number from 1-5");
				  String y = sc.next();
		        }
						   
						   System.out.println("--------------------------------");
					break;
					
					
					
				case 4:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen Product Quantity Add-Sell");
					
					System.out.println("What do you want to do?\n");
					
					System.out.println("1.Add Product");
					System.out.println("2.Sell Product");
					System.out.println("3.Show Add Sell History");
					System.out.println("4.Go Back");
					
					
					System.out.print("Enter your option: ");
					try{
					int option4 = sc.nextInt();

					switch(option4)
					{
						case 1:
						
							System.out.println("#####################");
							System.out.println("Add Product\n");

							System.out.print("Coffeeshop CID: ");
                            String cid1 = sc.next();
							System.out.print("Product PID: ");
							String pid1 = sc.next();
							
							System.out.print("Enter Add Quantity: ");
							int amount1 = sc.nextInt();
							
							if(amount1>0)
							{
								f.getCoffeeshop(cid1).getProduct(pid1).addQuantity(amount1);

								frwd.writeInFile("Quantity Added: "+ amount1+"  Product :"+f.getCoffeeshop(cid1).getProduct(pid1).getName()+"  Id :"+ pid1+"  CoffeeShop: "+f.getCoffeeshop(cid1).getName());
							}
							else
							{
								System.out.println("Invalid Amount");
							}
							
							System.out.println("#####################");
							break;
							
						case 2:
						
							System.out.println("#####################");
							System.out.println("Sell Product");
							System.out.print("Coffeeshop CID: ");
                            String cid2 = sc.next();
							System.out.print("Product PID: ");
							String pid2 = sc.next();
							
							System.out.print("Enter Sell Quantity: ");
							int amount2 = sc.nextInt();
							
							if(amount2>0 && amount2 <= f.getCoffeeshop(cid2).getProduct(pid2).getquantity())
							{
								f.getCoffeeshop(cid2).getProduct(pid2).sellQuantity(amount2);

								frwd.writeInFile("Sold Quantity: "+ amount2+"  Product :"+f.getCoffeeshop(cid2).getProduct(pid2).getName()+"  Id :"+ pid2+"   CoffeeShop : "+f.getCoffeeshop(cid2).getName());
							}
							else
							{
								System.out.println("Invalid Amount");
							}
							
							System.out.println("#####################");
							break;

						case 3:
						
							System.out.println("#####################");
							System.out.println("Show Add Sell History");
							frwd.readFromFile();
							
							System.out.println("#####################");
							break;
							
						case 4:
						
							System.out.println("#####################");
							System.out.println("Going Back..");
							System.out.println("#####################");
							break;
							
						default:
						
							System.out.println("#####################");
							System.out.println("Invalid Option");
							System.out.println("#####################");
							break;
					}
					}
					catch(InputMismatchException ime)
				{
			      System.out.println("InputMismatchException Occured for FoodItem Quantity Add-Sell");
			      System.out.println("Please Enter Your choice a number from 1-5");
				  String y = sc.next();
		        }
				catch(NullPointerException npe)
			{
				System.out.println("NullPointerException occured for Add-Sell");		
                System.out.println("Your input deta does not exist");
				
			}
					
					
					System.out.println("--------------------------------");
					break;
					
					
				 case 5:
				
					System.out.println("--------------------------------");
					System.out.println("You have choosen to Exit");
					repeat = false;
					System.out.println("--------------------------------");
					break;
					
				default:
				
					System.out.println("--------------------------------");
					System.out.println("Invalid Choice");
					System.out.println("--------------------------------");
					break;
			}
					
			}
			catch(InputMismatchException ime)
		{
			System.out.println("InputMismatchException Occured");
			System.out.println("Please Enter Your choice a number from 1-5");
				String x = sc.next();
		}
		
		catch(Exception e)
			{
				System.out.println("Exception occured ");
				e.printStackTrace();
				String a = sc.next();
				
			}
				
					
					
					
					
					
			    
			}
			
		}
	}


							
					
					
					