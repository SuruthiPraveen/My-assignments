package week1.day1assignment;

public class Mobiles {
public void makeCalls() {
char mobileModel = 's';
float mobileWeight = 10.6f;
System.out.println("Mobile model is " +mobileModel);
System.out.println("Mobile weight is " +mobileWeight);
}
public void sendMsg() {
boolean FullCharged = true;
int mobileCost= 15000;
System.out.println("Fullcharged " +FullCharged);
System.out.println("Mobile cost is " +mobileCost);
}
public static void main(String[] args) {
	Mobiles mob = new Mobiles();
mob.makeCalls();
mob.sendMsg();
System.out.println("This is my mobile");
}
}
