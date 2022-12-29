package week2.day2assignment;

public class Palindrome {
	public static void main(String[] args) {
int n= 32323;
int temp=0,rev;
for (int i=n;i!=0;i=i/10)
{
	rev=i%10;
	temp=(temp*10)+rev;
}
	if(temp==n)
	{
		System.out.println(n+" is a palindrome");
	}
	else
	{
		System.out.println(n+" is not a palindrome");
	}
}
}


