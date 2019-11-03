package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BritishAirwaysSteps {

	public static WebDriver driver;

	@Given("^launch british airways URL \"([^\"]*)\"$")
	public void launch_british_airways_URL(String arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:/Program Files/Automation/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.britishairways.com");
		driver.manage().window().maximize();
	}

	@And("^click on Registration Link$")
	public void click_on_Registration_Link() throws Throwable {
		driver.findElement(By.className("register")).click();
	}

	@Then("^check for registration page is opended")
	public void check_for_registration_page_is_opended() throws Throwable {
		String regPage = driver.getTitle();
		if (regPage.contains(("Registration Page"))) {
			System.out.println("Passed: Registration Page is Loaded");
		} else {
			System.out.println("Failed: Registration page did not open");

		}
	}

	@Then("^enter email address \"([^\"]*)\"$")
	public void enter_email_address(String arg1) throws Throwable {
		driver.findElement(By.id("email")).sendKeys("rebabeachresort2020@gmail.com");
	}

	@Then("^confirm the same email address \"([^\"]*)\" again$")
	public void confirm_the_same_email_address_again(String arg1) throws Throwable {
		driver.findElement(By.id("confirm-email")).sendKeys("rebabeachresort2020@gmail.com");
	}

	@Then("^enter the password \"([^\"]*)\"$")
	public void enter_the_password(String arg1) throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("Password@12345");
	}

	@Then("^confirm the same password \"([^\"]*)\"$")
	public void confirm_the_same_password(String arg1) throws Throwable {
		driver.findElement(By.id("confirm-password")).sendKeys("Password@12345");
	}

	@Then("^select the title \"([^\"]*)\"$")
	public void select_the_title(String arg1) throws Throwable {
		Select title = new Select(driver.findElement(By.id("title")));
		title.selectByVisibleText("Mr");
	}

	@Then("^enter the first name \"([^\"]*)\"$")
	public void enter_the_first_name(String arg1) throws Throwable {
		driver.findElement(By.id("first-name")).sendKeys("Chiranjit");
	}

	@Then("^enter the last name \"([^\"]*)\"$")
	public void enter_the_last_name(String arg1) throws Throwable {
		driver.findElement(By.id("family-name")).sendKeys("Saha");
	}

	@Then("^select the radio button Register with ba\\.com$")
	public void select_the_radio_button_Register_with_ba_com() throws Throwable {
		WebElement radioBtn = driver.findElement(By.xpath("//span[contains(text(),'Register with ba.com')]"));
		radioBtn.click();
	}

	@Then("^click on Join now$")
	public void click_on_Join_now() throws Throwable {
		WebElement radioBtn = driver.findElement(By.id("submitButton"));
		radioBtn.click();

	}

	@Then("^check registartion is successful$")
	public void registration_page_is_opended() throws Throwable {
		String regPage = driver.getTitle();
		if (regPage.contains(("British Airways"))) {
			System.out.println("Passed: Registration is successful");
		} else {
			System.out.println("Failed: Registration failed");

		}
	}

	@When("^click on Book$")
	public void click_on_Book() throws Throwable {
		driver.findElement(By.xpath("//a[@class='ng-binding'][contains(text(),'Book')]")).click();
	}

	@When("^click on Book a flight$")
	public void click_on_Book_a_flight() throws Throwable {
		driver.findElement(By.linkText("Book a flight")).click();
	}

	@Then("^check British Airways Flight page is opened$")
	public void check_British_Airways_Flight_page_is_opened() throws Throwable {
		String regPage = driver.getTitle();
		if (regPage.contains(("Compare & Book"))) {
			System.out.println("Passed: Booking page successfully loaded");
		} else {
			System.out.println("Failed: Booking page not loaded successfully");

		}
	}

	@Then("^click on More destinations under Europe$")
	public void click_on_More_destinations_under_Europe() throws Throwable {
		driver.findElement(By.xpath(
				"//body[@id='threeColumnResp']/div[@id='bodyWrapper']/section[@id='baBody']/section[@id='page']/div[@class='large-10 medium-9 small-12 columns']/div[@class='row']/div[@id='pageContentMain']/section[@id='1483931534136']/article[2]/a[1]"))
				.click();
	}

	@Then("^enter France in To Field$")
	public void enter_France_in_To_Field() throws Throwable {
		driver.findElement(By.id("toFilter")).sendKeys("PAR");
		Thread.sleep(3000);
		List<WebElement> toFiltr = driver.findElements(By.xpath("//ul[@id='destChoices']/ul/li"));
		System.out.println(toFiltr.size());
		System.out.println(toFiltr.get(0));
		for (int i = 0; i < toFiltr.size(); i++) {
			String getCountry = toFiltr.get(i).getText();
			if (getCountry.contains("Paris")) {
				toFiltr.get(i).click();
				break;
			}
		}
	}

	@Then("^Select One way$")
	public void select_One_way() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'one')]")).click();
	}

	@Then("^select Travel Class as First class$")
	public void select_Travel_Class_as_First_class() throws Throwable {
		Select title2 = new Select(driver.findElement(By.id("cabinFilter")));
		title2.selectByValue("F");
	}

	@Then("^click on Find lowest price$")
	public void click_on_Find_lowest_price() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button btn-primary small-button translate']")).click();
	}

	@Then("^the page should show \"([^\"]*)\" under Euorpe,UK and Ireland\\.$")
	public void the_page_should_show_under_Euorpe_UK_and_Ireland(String arg1) throws Throwable {
		String expectedMessage = "No destinations available.";
		String message = driver
				.findElement(By.xpath("//table[@id='tabpanel01']//h3[contains(text(),'No destinations available.')]"))
				.getText();
		if (message.equals(expectedMessage)) {
			System.out.println("Search was successful");
		} else {
			System.out.println("Search was not successful");
		}

	}

	@Then("^click on Feedback tab$")
	public void click_on_Feedback_tab() throws Throwable {
		Thread.sleep(3000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Usabilla Feedback Button')]"));
		driver.switchTo().frame(frameElement);

		driver.findElement(By.xpath("//html//body//img")).click();

	}
	
	
	@Then("^click on SiteFeedback frame$")
	public void click_on_SiteFeedback_frame() throws Throwable 
	 { 
		WebElement outer_iframe = driver.findElement(By.xpath ("//body[@id='usabilla-choice-container']"));
		driver.switchTo().frame(outer_iframe);
	    WebElement nested_iframe = driver.findElement(By.xpath("//div[@class='choice choice_general']//span[contains(text(),\"I'd like to give feedback on the page or website.\")]"));
	    driver.switchTo().frame(nested_iframe);
	    driver.findElement(By.xpath("//div[@class='choice choice_general']//span[contains(text(),\"I'd like to give feedback on the page or website.\")]")).click();
	    


	
	 }

	/*@Then("^check British Airways feedback popup is opened\\.$")
	public void check_British_Airways_feedback_popup_is_opened() throws Throwable {
	WebElement frameElement = driver.findElement(By.linkclass("Usabilla Feedback Form"));
	driver.switchTo().frame(frameElement);
	String expectedMessage = "British Airways website feedback";
	String message = driver.findElement(By.xpath("//h2[contains(text(),'British Airways website feedback')]")).getText();
		if (message.equals(expectedMessage)) {
			System.out.println("Feedback Popup was successful");
		} 
		else {
			System.out.println("Feedback Popup was not successful");
		}

	}

	/*
	 * 
	 * 
	 * 
	 * @Then("^check the rating popup is opened\\.$") public void
	 * check_the_rating_popup_is_opened() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions throw new PendingException(); }
	 * 
	 * @When("^click on only one smiley$") public void click_on_only_one_smiley()
	 * throws Throwable { // Write code here that turns the phrase above into
	 * concrete actions throw new PendingException(); }
	 * 
	 * @Then("^check Please tell us more options are visible to user$") public void
	 * check_Please_tell_us_more_options_are_visible_to_user() throws Throwable { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * PendingException(); }
	 * 
	 * @Then("^enter the experience in the textbox$") public void
	 * enter_the_experience_in_the_textbox() throws Throwable { // Write code here
	 * that turns the phrase above into concrete actions throw new
	 * PendingException(); }
	 * 
	 * @When("^click on Done button$") public void click_on_Done_button() throws
	 * Throwable { // Write code here that turns the phrase above into concrete
	 * actions throw new PendingException(); }
	 * 
	 * @Then("^Good to know popup is opened$") public void
	 * good_to_know_popup_is_opened() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions throw new PendingException(); }
	 * 
	 * @When("^click on Done button again$") public void
	 * click_on_Done_button_again() throws Throwable { // Write code here that turns
	 * the phrase above into concrete actions throw new PendingException(); }
	 * 
	 * @Then("^check the current BA page is open\\.$") public void
	 * check_the_current_BA_page_is_open() throws Throwable { // Write code here
	 * that turns the phrase above into concrete actions throw new
	 * PendingException(); }
	 * 
	 * 
	 */

}
