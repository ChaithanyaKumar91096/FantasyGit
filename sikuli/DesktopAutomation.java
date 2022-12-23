package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DesktopAutomation {
	Screen s = new Screen();
  @Test
  public void destopAutomation() throws FindFailed, Exception{
	  Thread.sleep(3000);
	 // s.click("D:\\KGF\\WVB.PNG");
	//  s.click("D:\\KGF\\Haze.PNG");
	//  s.click("D:\\KGF\\Screenshot.PNG");
	  Thread.sleep(5000);
	  s.click("D:\\scrennshot\\desktop\\Ck.PNG");
	 // s.type("D:\\scrennshot\\desktop\\Search.PNG", "Sikuli");
	  s.dragDrop("D:\\KGF\\Obs.PNG","D:\\KGF\\raju.PNG");
  }
}
