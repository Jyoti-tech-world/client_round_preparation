package client_round_preparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SeparateEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6,7,2,5,6);
		
		list= Stream.concat(list.stream().filter(a->a%2==0), list.stream().filter(a->a%2!=0)).collect(Collectors.toList());
		list.stream().forEach(a->System.out.println(a));
	}

}
