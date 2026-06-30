package client_round_preparation;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =  {1,1,2,3,4,5};
		int k = 4, x = 5;
		
		 List<Integer> list= new ArrayList<>();
	     int start=0;  // 0
	     int end= arr.length-k; // 2

	     while(start<end)
	     {
	        int mid= start+(end-start)/2;

	        if(x- arr[mid] > arr[mid+k]-x)
	        {
	          start= mid+1;
	        }
	        else
	        {
	         end= mid;
	        }
	     }

	     for(int i= start;i<start+k;i++)
	     {
	        list.add(arr[i]);
	     }
	     System.out.println(list);

	}

}
