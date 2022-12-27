package week1.day1;

public class Calculator {
public void sub() {
int a=5;
int b= 2;
System.out.println(a-b);
}
public int mul(int a,int b) {
	return a*b;
}
public static void main(String[] args) {
	Calculator cal = new Calculator();
	cal.sub();
	System.out.println(cal.mul(10, 10));
}
}
