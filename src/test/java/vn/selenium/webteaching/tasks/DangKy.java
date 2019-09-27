package vn.selenium.webteaching.tasks;

import static org.openqa.selenium.Keys.ENTER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import vn.selenium.webteaching.ui.HomePage;

public class DangKy implements Task{
	private String name;
	private String email;
	private String password;
	private String phoneNumber;

	public DangKy(String name, String email, String password, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	@Override
	@Step("{0} dang ky voi thong tin: #name #email #password #phoneNumber")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(

				//Enter.theValue(keyword).into(HomePage.SEARCH_BOX).thenHit(ENTER)
				Click.on(HomePage.LOGIN_BUTTON),
				Click.on(HomePage.REGISTER_BUTTON),
				Enter.theValue(name).into(HomePage.NAME_TXTBOX),
				Enter.theValue(email).into(HomePage.EMAIL_TXTBOX),
				Enter.theValue(password).into(HomePage.PASS_TXTBOX),
				Enter.theValue(password).into(HomePage.REPEAT_PASS_TXTBOX),
				Enter.theValue(phoneNumber).into(HomePage.PHONE_TXTBOX),
				Click.on(HomePage.REGISTER_NEW_BUTTON)
		);

	}

	public static DangKy theoThongTin(String name, String email, String password, String phoneNumber) {
		return Tasks.instrumented(DangKy.class, name, email, password, phoneNumber);
		// return new keyword(keyword);
	}
}
