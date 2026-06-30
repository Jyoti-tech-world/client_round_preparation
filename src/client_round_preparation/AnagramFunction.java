package client_round_preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arr= {"eat","tea","tan","ate","nat","bat"};
		
//	Collection<List<String>> list=	Arrays.stream(arr).collect(Collectors.groupingBy(word->
//		{
//			char [] ch= word.toCharArray();
//			Arrays.sort(ch);
//			return String.valueOf(ch);
//		})).values();
	
	//list.stream().forEach(a->System.out.println(a));
	
	Map<String, List<String>> mp = new HashMap<>();
	

	for(String str: arr)
	{
		
		char c[]= str.toCharArray();
		Arrays.sort(c);
		String sorted= String.valueOf(c);
		if(mp.containsKey(sorted))
		{
			 List<String> values= mp.get(sorted);
			 values.add(str);
			 mp.put(sorted, values);
		}
		else
		{
			List<String> li= new ArrayList<String>();
			li.add(str);
			 mp.put(String.valueOf(c),li );
		}
		
	}
	
	mp.entrySet().stream().map(a->a.getValue()).forEach(a->System.out.println(a));

	}
	
	


}
