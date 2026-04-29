package client_round_preparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class AvoidDuplicate {
	
	public static void main(String [] args)
	{
	Map<Integer,Employee> mp= new LinkedHashMap<>();
	Employee e1=	new Employee(1,"Jyoti","SE");
	Employee e2=  new Employee(2,"Pankaj","SE");
	Employee e3=  new Employee(1,"Priya","SE");
	
	mp.putIfAbsent(e1.id(),e1);
	mp.putIfAbsent(e2.id(),e2);
	mp.putIfAbsent(e3.id(),e3);
	
	System.out.println(mp);
	System.out.println("chnage added");

}
}
record Employee(int id,String name, String desgn)
{
	
}