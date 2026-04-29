package client_round_preparation;



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TopTenSalariedEmp {

	public static void main(String[] args) {
		
		Employeee e1=	new Employeee("Jyoti","SE",1000);
		Employeee e2=  new Employeee("Pankaj","SE",2000);
		Employeee e3=  new Employeee("Priya","HR",3000);
		Employeee e4=  new Employeee("Priya","HR",4000);
		Employeee e5=  new Employeee("Priya","HR",5000);
		Employeee e6=  new Employeee("Priya","HR",6000);
		Employeee e7=  new Employeee("Priya","SE",3000);
		
		List<Employeee> list= Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
	List<String> res= list.stream().filter(a->a.dept().equals("HR") && a.salary()> 3000).map(b->b.name()).collect(Collectors.toList());
		
	 res.stream().forEach(a-> System.out.println(a));
		

	}

}
record Employeee(String name, String dept, int salary)
{
	
}
