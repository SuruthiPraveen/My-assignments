package week4.day1;

import week4.day1assignments.Language;
import week4.day1assignments.MultipleLangauge;
import week4.day1assignments.TestTool;

public class Automation extends MultipleLangauge implements TestTool,Language{



	public void java() {
	System.out.println("java");
	}

	public void Selenium() {
	System.out.println("Selenium");
	}

	@Override
	public void ruby() {
	System.out.println("ruby");
	}
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.java();
		obj.python();
		obj.ruby();
		obj.Selenium();
	}

}
