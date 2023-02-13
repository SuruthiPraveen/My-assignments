package week4.day1assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int[] n={3,2,11,4,6,7};
		int[] m= {1,2,8,4,9,7};
		List<Integer>num=new ArrayList<Integer>();
		List<Integer>num1=new ArrayList<Integer>();
		for(int i=0;i<n.length;i++) {
		num.add(n[i]);
		}
		for(int j=0;j<m.length;j++) {
			num1.add(m[j]);
		}
		System.out.println(num);
		System.out.println(num1);
		System.out.print("The intersection value is");
		for(int i=0;i<num.size();i++) {
			for(int j=0;j<num1.size();j++) {
				if(num.get(i)==num1.get(j)){
					System.out.print(" "+num.get(i));
				}
			}
		}
		
		

	}

}
