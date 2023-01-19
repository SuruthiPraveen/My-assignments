package week3.day2assignments;

public class Students {
	public void getStudentInfo(int a) {
		System.out.println("id:" +a);
	}
	public void getStudentInfo(String a) {
	System.out.println("nam:" +a);
	}
	public void getStudentInfo(String a,String b) {
	System.out.println("email:" +a);
	}
	public void getStudentInfo(int a,int b) {
		System.out.println("PHN:" +a);
	}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(123);
		obj.getStudentInfo(123445566, 0);
		obj.getStudentInfo("abc");
		obj.getStudentInfo("abcd", "def");
		
	}
}
