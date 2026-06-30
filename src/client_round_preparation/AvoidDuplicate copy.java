package client_round_preparation;

import java.util.LinkedHashMap;
import java.util.Map;

public class AvoidDuplicate {
	
	public static void main(String [] args)
	{
	Map<Integer,Employee1> mp= new LinkedHashMap<>();
	Employee1 e1=	new Employee1(1,"Jyoti","SE");
	Employee1 e2=  new Employee1(2,"Pankaj","SE");
	Employee1 e3=  new Employee1(1,"Priya","SE");
	
	mp.putIfAbsent(e1.id(),e1);
	mp.putIfAbsent(e2.id(),e2);
	mp.putIfAbsent(e3.id(),e3);
	
	System.out.println(mp);
	System.out.println("chnage added");

}
}
record Employee1(int id,String name, String desgn)
{
	
}