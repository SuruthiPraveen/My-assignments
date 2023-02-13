package week4.day1assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String s ="";
		String[] split=text.split(" ");
		List<String>lst=new ArrayList<String>();
		for(int i=0;i<split.length;i++) {
			lst.add(split[i]);
		}
		
		System.out.println(lst);
		List<String>lst1=new ArrayList<String>();
for (int i=0;i<lst.size();i++) {
	for(int j=i+1;j<lst.size();j++) {
if(lst.get(i).contains(lst.get(j))) {
	lst1.add(lst.get(i));
}
		
	}
}
lst.removeAll(lst1);
System.out.println(lst);
				
			}
		}
		

			



