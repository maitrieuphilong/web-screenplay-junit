package vn.selenium.webteaching.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import vn.selenium.webteaching.ui.ResutlPage;

public class Luachon implements Task{
	
	private String index;
	
	public Luachon(String index) {
		this.index = index;
	}

	@Override
	@Step("{0} lua chon ket qua tim kiem o vi tri thu #index")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(ResutlPage.FIRST_LINK.of(index))
				);
	}

	public static Performable ketqua(String index) {
		// TODO Auto-generated method stub
		return instrumented(Luachon.class, index);
	}

}
