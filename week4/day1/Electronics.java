package week4.day1;


public class Electronics extends TeleVision implements Mobile,Laptop{
@Override
public void brand() {
System.out.println("From Television Abstract Class");
}
public void version() {
System.out.println("From Mobile interface");
}
public void windows() {
System.out.println("From Laptop interface");
	}
public static void main(String[] args) {
	Electronics obj=new Electronics();
	obj.brand();
	obj.android();
	obj.version();
	obj.windows();
}
}
