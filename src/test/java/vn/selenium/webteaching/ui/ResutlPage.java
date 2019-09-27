package vn.selenium.webteaching.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ResutlPage {

	public static final Target FIRST_LINK = Target
			.the("ket qua dau tien")
			.locatedBy("(//div[@class='bkWMgd']//a/h3/div)[{0}]");
	
}
