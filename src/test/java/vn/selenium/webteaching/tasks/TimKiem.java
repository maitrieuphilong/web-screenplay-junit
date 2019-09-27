package vn.selenium.webteaching.tasks;

import static org.openqa.selenium.Keys.ENTER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import vn.selenium.webteaching.ui.HomePage;

public class TimKiem implements Task {

	private String keyword;

	public TimKiem(String keyword) {
		this.keyword = keyword;
	}

	@Override
	@Step("{0} tim kiem mot tu khoa la: #keyword")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(

				Enter.theValue(keyword).into(HomePage.SEARCH_BOX).thenHit(ENTER)

		);

	}

	public static TimKiem tu(String keyword) {
		return Tasks.instrumented(TimKiem.class, keyword);
		// return new keyword(keyword);
	}

}
