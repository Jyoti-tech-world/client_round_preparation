package client_round_preparation;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;



public class Infogain_JavaEight {

	public static void main(String[] args) {
		
		Employee e1=  new Employee(1,"Jyoti",1,100,"SE");
		Employee e2=  new Employee(2,"Pankaj",1,100,"SE");
		Employee e3=  new Employee(3,"Jyoti",1,100,"SE");
		Employee e4=  new Employee(4,"Pankaj",1,100,"HR");
		Employee e5=  new Employee(5,"Pankaj",1,100,"HR");
		Employee e6=  new Employee(6,"Jyoti",1,100,"HR");
		Employee e7=  new Employee(7,"Jyoti",1,100,"SE");

		
		List<Employee> list= Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
	   Map<String,Set<String>> mp=list.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.mapping(Employee::getDepartment, Collectors.toSet())));
	   mp.entrySet().stream().filter(a->a.getValue().size()>=2).map(Map.Entry::getKey).forEach(a->System.out.println(a));
	   
	   List<User> users = Arrays.asList(

               new User("John", LocalDate.of(2026, 3, 10)),
               new User("Sam", LocalDate.of(2026, 3, 12)),
               new User("David", LocalDate.of(2026, 3, 15)),
               new User("Alex", LocalDate.of(2026, 5, 18)),
               new User("Emma", LocalDate.of(2026, 5, 20)),
               new User("Sophia", LocalDate.of(2026, 5, 5)),
               new User("Chris", LocalDate.of(2026, 4, 28)),
               new User("Olivia", LocalDate.of(2026, 5, 1)),
               new User("Daniel", LocalDate.of(2026, 3, 16)),
               new User("Mia", LocalDate.of(2026, 5, 21))

       );
	   
	Map<Boolean,List<User>> user=  users.stream().collect(Collectors.partitioningBy(a->(a.getLastLogin().isAfter(LocalDate.now().minusDays(30)))));
	
	 user.forEach((a,b)->
	  {
		   System.out.println(a);
		   b.stream().forEach(c->System.out.print(c.getName()+" "));
	  });

	}

}
