package week3.day2;

public class ReverseString extends OverLoadingMul {
	public void mul(int a,int b) {
		System.out.println(10);	
	}
	public static void main(String[] args) {
		String s="Praveen";
		char[] charArray = s.toCharArray();
		for(int i = charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		ReverseString obj=new ReverseString();
		obj.mul(0, 0);
	}

}
