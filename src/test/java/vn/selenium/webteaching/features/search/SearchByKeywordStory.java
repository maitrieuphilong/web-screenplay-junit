package vn.selenium.webteaching.features.search;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.Matchers.containsString;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.selenium.webteaching.tasks.Luachon;
import vn.selenium.webteaching.tasks.OpenTheApplication;
import vn.selenium.webteaching.tasks.TimKiem;

//@RunWith(SerenityRunner.class)
//public class SearchByKeywordStory {

//    Actor anna = Actor.named("Anna");
//
//    @Managed(uniqueSession = true)
//    public WebDriver herBrowser;
//
//    @Steps
//    OpenTheApplication openTheApplication;
//
//    @Before
//    public void annaCanBrowseTheWeb() {
//        anna.can(BrowseTheWeb.with(herBrowser));
//    }
//
//    @Test
//    public void search_results_should_show_the_search_term_in_the_title() {
//
//        anna.wasAbleTo(openTheApplication);
//
//        when(anna).attemptsTo(
//        		
//        		// tim kiem tu khoa screenplay
//        		
//        		TimKiem.tu("screenplay"),
//        		// lua chon ket qua dau tien tren danh sach
//        		
//        		Luachon.ketqua("1")
//        		);
//
//        then(anna).should(eventually(seeThat(
//        		
//        		TheWebPage.title(), containsString("screenplay")))
//        		
//        		
//        		);
//
//    }
//}