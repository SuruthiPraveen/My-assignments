package week3.day2;

public class FindCharCount {
	public static void main(String[] args) {
		String s="testleaf";
		char[] c = s.toCharArray();
		int j=0;
		for(int i =0;i<c.length;i++) {
			if(c[i]=='e') {
			j++;	
			}
			
		}
		System.out.println(j);
	}

}
