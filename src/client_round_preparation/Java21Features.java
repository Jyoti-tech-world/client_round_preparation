package client_round_preparation;

public class Java21Features {

	public static void main(String[] args) {
		
		var name= "Jyoti";
		var age= 28;
	
		System.out.println("Hello " + name +" "+ age);
		
		int day =3;
		
		String result= switch(day)
				{
		case 1-> "Monday";
		case 2-> "Tuesday";
		case 3-> "Wednesday";
		default-> "Other day";
				};
				
				System.out.println(result);	
				
				Student s= new Student("Jyoti",-21);
				
				System.out.println(s.age());

				
	}

}
record Student(String name, int age) // it is a special class used to store data.
{
	public Student  // compact constructor
	{
		if (age<0) throw new IllegalArgumentException("Age cant be negative");
	}
	 
}
