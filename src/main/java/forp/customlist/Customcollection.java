package forp.customlist;
import java.util.*;
import java.io.*;  
public class Customcollection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		operation p = new operation();
		p.display();
		while(true)
		{
		System.out.println("\n1.Add an element \n2.Delete an element \n3.Fetch an element");
		System.out.println("\nSelect type of operations to be performed:");
		int choice=sc.nextInt();
		if(choice==1)
		 p.addoperation();
		else if(choice==2)
		p.deleteoperation();
		else if(choice==3)
		p.fetchoperation();
		else
		{
		System.out.println("Please select valid option");
		break;
		}
		}
		}
		}
interface myinterface {
LinkedHashSet<String> nameset=new LinkedHashSet<String>();
public void display();
public void addoperation();
public void deleteoperation();
public void fetchoperation();
Scanner myObj = new Scanner(System.in);
}
class operation implements myinterface {
public void display()
{
System.out.println("Original list of element:");
nameset.add("Ram");
nameset.add("Shyam");
nameset.add("Sita");
nameset.add("Gita");
nameset.add("Hari");
nameset.add("Kamlesh");
nameset.add("Sanjay");
nameset.add("Sanju");
nameset.add("Harish");
nameset.add("Binod");  
Iterator<String> itr=nameset.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}
} 
public void addoperation()
{
System.out.println("\nEnter the element to be added in list(String type):");    
String name=myObj.nextLine(); 
nameset.add(name);
Iterator<String> itr=nameset.iterator(); 
System.out.println("****List after addition of element****"); 
while(itr.hasNext())
{  
System.out.println(itr.next());  
}     
}
public void deleteoperation()
{
System.out.println("Enter the element to be removed from list(String type):");    
String name=myObj.nextLine(); 
nameset.remove(name);
Iterator<String> itr=nameset.iterator();  
System.out.println("****List after deletion****");
while(itr.hasNext())
{  
System.out.println(itr.next());  
}     
}
public void fetchoperation()
{
ArrayList<String> list=new ArrayList<String>(nameset);
System.out.println(list);
System.out.println("Enter the index of element to be fetched from the list(index start from 1):\n");
int n=myObj.nextInt();
System.out.println("Element at position is :"+list.get(n-1));
}
}