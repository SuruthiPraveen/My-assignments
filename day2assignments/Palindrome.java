package week3.day2assignments;

public class Palindrome {

	public static void main(String[] args) {
		String s = "mam";
		String rev ="";
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
		rev=rev+c[i];
		}
		System.out.println("The given string is " +s);
		System.out.println("The reversed string is " +rev);
		if (rev.equalsIgnoreCase(s)) {
			System.out.println(s+ " is palindrome");
		}
		else
		{
			System.out.println(s+ " is not palindrome");
		}
	}

}
