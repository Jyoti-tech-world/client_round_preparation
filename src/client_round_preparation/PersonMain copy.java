package client_round_preparation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class PersonMain {

	public static void main(String[] args) {

		    Person p1 = new Person("Alice");
	        Person p2 = new Person("Alice");

	        System.out.println(p1.equals(p2));       // ?  True

	        Set<Person> set = new HashSet<>();
	        set.add(p1);
	        set.add(p2);
	        System.out.println(set.size());          // ?   2

	        Map<Person, String> map = new HashMap<>();
	        map.put(p1, "Engineer");
	        System.out.println(map.get(p2));         // ?    Null
	}

}
class Person {
    String name;
    Person(String name)
    { this.name = name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        return Objects.equals(name, ((Person) o).name);
    }
    // hashCode NOT overridden!
    @Override
    public int hashCode()
    {
    	return Objects.hash(name);
    }
}
