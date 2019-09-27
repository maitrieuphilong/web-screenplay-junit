package vn.selenium.webteaching.ui;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.ByTarget;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

	public static final Target SEARCH_BOX = Target.the("search field").located(By.name("q"));
	public static final Target LOGIN_BUTTON = Target.the("login button").locatedBy("//a[contains(@href,'/login')]");
	public static final Target REGISTER_BUTTON = Target.the("register button").locatedBy("//a[contains(@href,'/register')]");
	public static final Target NAME_TXTBOX = Target.the("textbox to input name").locatedBy("(//*[@class='form-control'])[1]");
	public static final Target EMAIL_TXTBOX = Target.the("textbox to input email").locatedBy("(//*[@class='form-control'])[2]");
	public static final Target PHONE_TXTBOX = Target.the("textbox to input phone number").locatedBy("(//*[@class='form-control'])[3]");
	public static final Target PASS_TXTBOX = Target.the("textbox to input password").locatedBy("(//*[@class='form-control'])[4]");
	public static final Target REPEAT_PASS_TXTBOX = Target.the("textbox to reinput password").locatedBy("(//*[@class='form-control'])[5]");
	public static final Target REGISTER_NEW_BUTTON = Target.the("register button").locatedBy("//*[@class='btn btn-login']");

//	public static final Target LOGIN_BUTTON = ByTarget
//			.the("login button")
//			.locatedForAndroid(MobileBy.AccessibilityId("login"))
//			.locatedForIOS(MobileBy.AccessibilityId("login"));

}
