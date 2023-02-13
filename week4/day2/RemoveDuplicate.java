package week4.day2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String i="Testleaf";
		Set<Character>s= new LinkedHashSet<Character>();
		char[] c = i.toCharArray();
		for (int j = 0; j < c.length; j++) {
			if(!s.add(c[j]))
			s.remove(c[j]);
		}
		System.out.println(s);
	}

}
