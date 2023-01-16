package week3.day2;

public class OverLoadingMul {
public void mul(int a,int b) {
	System.out.println(a*b);	
}
public void mul(int a,float b) {
System.out.println(a*b);
}
public void div(int a,int b) {
System.out.println(a/b);
}

public static void main(String[] args) {
	OverLoadingMul obj = new OverLoadingMul();
	obj.mul(5, 2);
	obj.mul(5, 2.f);
	obj.div(10, 2);
}	
}
