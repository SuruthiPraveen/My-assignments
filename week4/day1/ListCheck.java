package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class ListCheck {
public static void main(String[] args) {
	List<String> lst=new ArrayList<String>();
	lst.add("Adam");
	lst.add("Ben");
	lst.add("Zara");
	lst.add("Adam");
	lst.add("Charlie");
	lst.add("James");
	lst.add("Ben");
	for(int i=0;i<lst.size();i++) {
	for(int j=i+1;j<lst.size();j++) {
		if(lst.get(i)==lst.get(j)) {
			System.out.println(lst.get(i));
		}
	}
	}
}
}
