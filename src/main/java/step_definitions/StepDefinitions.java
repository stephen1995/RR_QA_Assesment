package step_definitions;

import cucumber.api.java.After;
import helper.Helper;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MainPage;
import base_class.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class StepDefinitions extends BaseClass {

	private static Actions actions;
	private static MainPage page;
	private static Helper help;

	@Given("The user has navigated to Randall Reilly page")
	public void the_user_has_navigated_to_Randall_Reilly_page() {
		BaseClass.setup("https://www.randallreilly.com/");
	}

	@Then("Verify that the title is {string}")
	public void verify_that_the_title_is(String title) {
		driver.getTitle().contains(title);
	}

	@Given("User mouse hover on Talent Intelligence link")
	public void user_mouse_hover_on_Talent_Intelligence_link() {
		page = new MainPage();

		actions = new Actions(driver);
		actions.moveToElement(page.talentIntelligenceLnk).build().perform();
	}

	@Given("User selects the {string} option")
	public void user_selects_the_option(String option) {
		help = new Helper();
		actions.keyDown(Keys.CONTROL).click(help.findLinkByText(option)).build().perform();
		actions.keyUp(Keys.CONTROL).build().perform();
	}

	@Given("User verify that the URL contains {string}")
	public void user_verify_that_the_URL_contains(String url) {
		help.switchToTab();
		Assert.assertTrue(driver.getCurrentUrl().contains(url));
	}

	@After
	public void tearDown() {
		driver.quit();
	}


}
