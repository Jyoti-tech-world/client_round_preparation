package client_round_preparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AlterIterate {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
	
		while(!list.isEmpty())
		{
			int sum=0;
			Iterator<Integer> it= list.iterator();
			boolean alternate= true;
			
			while(it.hasNext())
			{
				int value= it.next();
				if(alternate)
				{
					sum+= value;
					it.remove();
					
				}
				alternate= !alternate;
			}
			System.out.println(sum);
		}

	}

}
