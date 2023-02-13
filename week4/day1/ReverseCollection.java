package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseCollection {
public static void main(String[] args) {
	String s="";
	List<String> lst=new ArrayList<String>();
	
	lst.add("Red");
	lst.add("Green");
	lst.add("Blue");
	lst.add("Yellow");
	lst.add("Brown");
	
for(int i=lst.size()-1;i>=0;i--) {
	s=s+lst.get(i);	
}
List<String> lst1=new ArrayList<String>(Arrays.asList(s));
System.out.println(lst1);
}
}
