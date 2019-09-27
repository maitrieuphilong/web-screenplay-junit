package vn.selenium.webteaching.features.story;

import static net.serenitybdd.screenplay.GivenWhenThen.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.selenium.webteaching.tasks.DangKy;
import vn.selenium.webteaching.tasks.Luachon;
import vn.selenium.webteaching.tasks.OpenTheApplication;
import vn.selenium.webteaching.tasks.TimKiem;

@RunWith(SerenityRunner.class)
public class RegisterNewUserStory {
	Actor peter = Actor.named("Peter");
	
	@Managed(uniqueSession = true)
    public WebDriver hisBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void peterCanBrowseTheWeb() {
        peter.can(BrowseTheWeb.with(hisBrowser));
    }
    
    @Test
    public void register_new_user_with_email_address_show_message_success() {
    	peter.wasAbleTo(openTheApplication);
    	when(peter).attemptsTo(
        		
        		// click nut dang nhap/dang ky
        		DangKy.theoThongTin("abc", "abc@gmail.com", "P@ssword123", "0923599999")
        		
        		
//        		TimKiem.tu("screenplay"),
//        		// lua chon ket qua dau tien tren danh sach
//        		
//        		Luachon.ketqua("1")
        		);
    }
}
